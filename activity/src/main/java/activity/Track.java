package activity;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Track {

    private List<TrackPoint> trackPoints = new ArrayList<>();

   public void addTrackPoint(TrackPoint trackPoint){
       trackPoints.add(trackPoint);
   }

   public double getDistance(){

       double fullDistance=0.0;

       for (int i = 1; i <trackPoints.size() ; i++) {
           TrackPoint currentElevation=trackPoints.get(i);
           TrackPoint previousElevation=trackPoints.get(i-1);

           fullDistance+=currentElevation.getDistanceFrom(previousElevation);
       }
       return fullDistance;
   }

    public double getFullElevation(){

        double fullElevation=0.0;

        for (int i = 1; i <trackPoints.size() ; i++) {
            double currentElevation=trackPoints.get(i).getElevation();
            double previousElevation=trackPoints.get(i-1).getElevation();

            if(previousElevation<currentElevation){
                fullElevation+=(currentElevation-previousElevation);
            }
        }

        return fullElevation;
    }

    public double getFullDecrease(){

        double fullDescent=0.0;

        for (int i = 1; i <trackPoints.size() ; i++) {
            double currentElevation=trackPoints.get(i).getElevation();
            double previousElevation=trackPoints.get(i-1).getElevation();

            if(previousElevation>currentElevation){
                fullDescent+=Math.abs(currentElevation-previousElevation);
            }
        }

        return fullDescent;
    }

    public double getRectangleArea(){
       double minLatitude=findMinimumCoordinate().getLatitude();

        double maxLatitude= findMaximumCoordinate().getLatitude();

        double minLongitude=findMinimumCoordinate().getLongitude();

        double maxLongitude= findMaximumCoordinate().getLongitude();
        ;

        double area=
                (maxLatitude-minLatitude)*
                        (maxLongitude-minLongitude);

        return area;
    }

    public void loadFromGpx(Path path) {

        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line;
            double latitude = 0;
            double longitude = 0;
            double elevation = 0;
            Coordinate temp=null;

            while ((line = reader.readLine()) != null) {
                if (line.contains("<trkpt")) {
                    latitude = Double.parseDouble(line.substring(24, 34));        //24,34
                    longitude = Double.parseDouble(line.substring(41, 51));  //41,51
                    temp = new Coordinate(latitude, longitude);
                } else if (line.contains("<ele")) {
                    elevation = Double.parseDouble(line.substring(21, 26));     //21,26
                    trackPoints.add(new TrackPoint(temp, elevation));
                }
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    public Coordinate findMaximumCoordinate(){
       double maxLatitude=trackPoints.stream().map(trackPoint -> trackPoint.getCoordinate()).
               sorted(Comparator.comparing(Coordinate::getLatitude).reversed()).
               mapToDouble(coordinate->coordinate.getLatitude()).findFirst().orElseThrow(()->new IllegalArgumentException("Coordinate is empty"));

        double maxLongitude=trackPoints.stream().map(trackPoint -> trackPoint.getCoordinate()).
                sorted(Comparator.comparing(Coordinate::getLongitude).reversed()).
                mapToDouble(coordinate->coordinate.getLongitude()).findFirst().orElseThrow(()->new IllegalArgumentException("Coordinate is empty"));
       return new Coordinate(maxLatitude,maxLongitude);
    }

    public Coordinate findMinimumCoordinate(){
        double minLatitude=trackPoints.stream().map(trackPoint -> trackPoint.getCoordinate()).
                sorted(Comparator.comparing(Coordinate::getLatitude)).
                mapToDouble(coordinate->coordinate.getLatitude()).findFirst().orElseThrow(()->new IllegalArgumentException("Coordinate is empty"));

        double minLongitude=trackPoints.stream().map(trackPoint -> trackPoint.getCoordinate()).
                sorted(Comparator.comparing(Coordinate::getLongitude)).
                mapToDouble(coordinate->coordinate.getLongitude()).findFirst().orElseThrow(()->new IllegalArgumentException("Coordinate is empty"));

        return new Coordinate(minLatitude,minLongitude);
    }

    public List<TrackPoint> getTrackPoints() {
        return trackPoints;
    }

    public static void main(String[] args) {
        Track track=new Track();
        Path path= Paths.get("src/test/resources/track.txt");

        //track.loadFromGpx(path);
       // System.out.println(track.getTrackPoints().get(0));
        //double a= 47.2181230;
        //System.out.println(a);

        Coordinate coordinate1=new Coordinate(12.5, 34.89);
        Coordinate coordinate2=new Coordinate(12.6, 34.123);
        Coordinate coordinate3=new Coordinate(12.6, 38.123);
        Coordinate coordinate4=new Coordinate(12.6, 36.123);

        TrackPoint trackPoint=new TrackPoint(coordinate1,125);
        TrackPoint trackPoint2=new TrackPoint(coordinate2,200);
        TrackPoint trackPoint3=new TrackPoint(coordinate3,1000);
        TrackPoint trackPoint4=new TrackPoint(coordinate4,100);
/*
        track.addTrackPoint(trackPoint);
        track.addTrackPoint(trackPoint2);
        track.addTrackPoint(trackPoint3);
        track.addTrackPoint(trackPoint4);*/

        track.addTrackPoint(new TrackPoint(new Coordinate(12.5, 34.89), 123));
        track.addTrackPoint(new TrackPoint(new Coordinate(-12.5, 45.7), 124));
        track.addTrackPoint(new TrackPoint(new Coordinate(13.7, -6.0), 0));
        track.addTrackPoint(new TrackPoint(new Coordinate(3.67, -42.789), 200));

        System.out.println(track.getDistance());

    }
}
