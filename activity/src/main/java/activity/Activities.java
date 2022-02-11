package activity;

import java.util.ArrayList;
import java.util.List;

public class Activities {

    private List<Activity> listOfActivities;

    public Activities(List<Activity> listOfActivities) {
        this.listOfActivities = listOfActivities;
    }

    public void addActivity(Activity activity) {
        listOfActivities.add(activity);
    }

    public List<Report> distancesByTypes() {
        List<Report> result = new ArrayList<>();
        double distanceBasketball = listOfActivities.stream().filter(activity -> activity.getType() == ActivityType.BASKETBALL).
                mapToDouble(Activity::getDistance).sum();
        double distanceHiking = listOfActivities.stream().filter(activity -> activity.getType() == ActivityType.HIKING).
                mapToDouble(Activity::getDistance).sum();
        double distanceRunning = listOfActivities.stream().filter(activity -> activity.getType() == ActivityType.RUNNING).
                mapToDouble(Activity::getDistance).sum();
        double distanceBiking = listOfActivities.stream().filter(activity -> activity.getType() == ActivityType.BIKING).
                mapToDouble(Activity::getDistance).sum();

        result.add(new Report(ActivityType.BIKING, distanceBiking));
        result.add(new Report(ActivityType.HIKING, distanceHiking));
        result.add(new Report(ActivityType.RUNNING, distanceRunning));
        result.add(new Report(ActivityType.BASKETBALL, distanceBasketball));
        return result;
    }

    public int numberOfTrackActivities() {
        return (int) listOfActivities.stream().filter(ActivityWithTrack.class::isInstance).count();
    }

    public int numberOfWithoutTrackActivities() {
        return listOfActivities.size() - numberOfTrackActivities();
    }
}
