package activity;

public class Report {

    private final ActivityType activityType;
    private final double distance;

    public Report(ActivityType activityType, double distance) {
        this.activityType = activityType;
        this.distance = distance;
    }

    public double getDistance() {
        return distance;
    }

    public ActivityType getActivityType() {
        return activityType;
    }
}
