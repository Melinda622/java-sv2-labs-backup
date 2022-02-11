package activity;

import java.io.BufferedReader;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class Track {

    private List<TrackPoint> trackPoints = new ArrayList<>();

    public void addTrackPoint(TrackPoint trackPoint) {
        trackPoints.add(trackPoint);
    }

    public double getDistance() {
        double fullDistance = 0.0;

        for (int i = 1; i < trackPoints.size(); i++) {
            TrackPoint currentElevation = trackPoints.get(i);
            TrackPoint previousElevation = trackPoints.get(i - 1);
            fullDistance += currentElevation.getDistanceFrom(previousElevation);
        }
        return fullDistance;
    }

    public double getFullElevation() {
        double fullElevation = 0.0;

        for (int i = 1; i < trackPoints.size(); i++) {
            double currentElevation = trackPoints.get(i).getElevation();
            double previousElevation = trackPoints.get(i - 1).getElevation();
            if (previousElevation < currentElevation) {
                fullElevation += (currentElevation - previousElevation);
            }
        }
        return fullElevation;
    }

    public double getFullDecrease() {
        double fullDescent = 0.0;

        for (int i = 1; i < trackPoints.size(); i++) {
            double currentElevation = trackPoints.get(i).getElevation();
            double previousElevation = trackPoints.get(i - 1).getElevation();
            if (previousElevation > currentElevation) {
                fullDescent += Math.abs(currentElevation - previousElevation);
            }
        }
        return fullDescent;
    }

    public double getRectangleArea() {
        double minLatitude = findMinimumCoordinate().getLatitude();
        double maxLatitude = findMaximumCoordinate().getLatitude();
        double minLongitude = findMinimumCoordinate().getLongitude();
        double maxLongitude = findMaximumCoordinate().getLongitude();

        return (maxLatitude - minLatitude) * (maxLongitude - minLongitude);
    }

    public void loadFromGpx(Path path) {

        try (BufferedReader reader = Files.newBufferedReader(path)) {
            String line;
            double latitude;
            double longitude;
            double elevation;
            Coordinate temp = null;

            while ((line = reader.readLine()) != null) {
                if (line.contains("<trkpt")) {
                    latitude = Double.parseDouble(line.substring(24, 34));
                    longitude = Double.parseDouble(line.substring(41, 51));
                    temp = new Coordinate(latitude, longitude);
                } else if (line.contains("<ele")) {
                    elevation = Double.parseDouble(line.substring(21, 26));
                    trackPoints.add(new TrackPoint(temp, elevation));
                }
            }
        } catch (IOException ioe) {
            throw new IllegalStateException("Can not read file", ioe);
        }
    }

    public Coordinate findMaximumCoordinate() {
        double maxLatitude = trackPoints.stream().map(TrackPoint::getCoordinate).
                sorted(Comparator.comparing(Coordinate::getLatitude).reversed()).
                mapToDouble(Coordinate::getLatitude).findFirst().
                orElseThrow(() -> new IllegalArgumentException("Coordinate is empty"));

        double maxLongitude = trackPoints.stream().map(TrackPoint::getCoordinate).
                sorted(Comparator.comparing(Coordinate::getLongitude).reversed()).
                mapToDouble(Coordinate::getLongitude).findFirst().
                orElseThrow(() -> new IllegalArgumentException("Coordinate is empty"));

        return new Coordinate(maxLatitude, maxLongitude);
    }

    public Coordinate findMinimumCoordinate() {
        double minLatitude = trackPoints.stream().map(TrackPoint::getCoordinate).
                sorted(Comparator.comparing(Coordinate::getLatitude)).
                mapToDouble(Coordinate::getLatitude).findFirst().
                orElseThrow(() -> new IllegalArgumentException("Coordinate is empty"));

        double minLongitude = trackPoints.stream().map(TrackPoint::getCoordinate).
                sorted(Comparator.comparing(Coordinate::getLongitude)).
                mapToDouble(Coordinate::getLongitude).findFirst().
                orElseThrow(() -> new IllegalArgumentException("Coordinate is empty"));

        return new Coordinate(minLatitude, minLongitude);
    }

    public List<TrackPoint> getTrackPoints() {
        return new ArrayList<>(trackPoints);
    }
}
