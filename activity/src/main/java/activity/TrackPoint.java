package activity;

public class TrackPoint {

    private Coordinate coordinate;
    private double elevation;

    public TrackPoint(Coordinate coordinate, double elevation) {
        this.coordinate = coordinate;
        this.elevation = elevation;
    }

    public double getDistanceFrom(TrackPoint point){

    final int R = 6371; // Radius of the earth

    double latDistance = Math.toRadians(this.coordinate.getLatitude() - point.coordinate.getLatitude());
    double lonDistance = Math.toRadians(this.coordinate.getLongitude() - point.coordinate.getLongitude());
    double a = Math.sin(latDistance / 2) * Math.sin(latDistance / 2)
            + Math.cos(Math.toRadians(this.coordinate.getLatitude())) * Math.cos(Math.toRadians(point.coordinate.getLatitude()))
            * Math.sin(lonDistance / 2) * Math.sin(lonDistance / 2);
    double c = 2 * Math.atan2(Math.sqrt(a), Math.sqrt(1 - a));
    double distance = R * c * 1000; // convert to meters

    double height = this.elevation - point.elevation;

    distance = Math.pow(distance, 2) + Math.pow(height, 2);

    return Math.sqrt(distance);
    }

    public Coordinate getCoordinate() {
        return coordinate;
    }

    public double getElevation() {
        return elevation;
    }

    @Override
    public String toString() {
        return "TrackPoint{" +
                "coordinate=" + coordinate +
                ", elevation=" + elevation +
                '}';
    }

    public static void main(String[] args) {

        Coordinate coordinate1=new Coordinate(12.5, 34.89);
        Coordinate coordinate2=new Coordinate(12.6, 34.123);

        TrackPoint trackPoint=new TrackPoint(coordinate1,125);
        TrackPoint trackPoint2=new TrackPoint(coordinate2,200);

        System.out.println(trackPoint.getDistanceFrom(trackPoint2));
    }
}
