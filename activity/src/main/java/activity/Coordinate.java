package activity;

public class Coordinate {

    private final double latitude;
    private final double longitude;

    public Coordinate(double latitude, double longitude) {

        if (latitudeIsValid(latitude)) {
            this.latitude = latitude;
        } else {
            throw new IllegalArgumentException("Latitude has to be between -90 and 90");
        }

        if (longitudeIsValid(longitude)) {
            this.longitude = longitude;
        } else {
            throw new IllegalArgumentException("Longitude has to be between -180 and 180");
        }
    }

    private boolean latitudeIsValid(double latitude) {
        return latitude >= -90.0 && latitude <= 90.0;
    }

    private boolean longitudeIsValid(double longitude) {
        return longitude >= -180.0 && longitude <= 180.0;
    }

    public double getLatitude() {
        return latitude;
    }

    public double getLongitude() {
        return longitude;
    }
}
