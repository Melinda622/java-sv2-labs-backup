package activity;

public class Coordinate {

    private final double latitude;
    private final double longitude;


    public Coordinate(double latitude, double longitude) {
        if(latitude>=-90.0&&latitude<=90.0){
            this.latitude = latitude;
        }else{
            throw new IllegalArgumentException("Latitude has to be between -90 and 90");
        }

        if(longitude>=-180.0&&longitude<=180.0) {
            this.longitude = longitude;
        }else{
            throw new IllegalArgumentException("Longitude has to be between -180 and 180");
        }
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }

    @Override
    public String toString() {
        return "Coordinate{" +
                "latitude=" + latitude +
                ", longitude=" + longitude +
                '}';
    }
}
