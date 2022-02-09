package activity;

import java.util.ArrayList;
import java.util.List;

public class Activities {

    List<Activity> activities=new ArrayList<>();

    public Activities(List<Activity> activities) {
        this.activities = activities;
    }

    public void addActivity(Activity activity){
        activities.add(activity);
    }

    public List<Report> distancesByTypes(){
        List<Report> result=new ArrayList<>();

        double distanceBasketball=activities.stream().filter(activity -> activity.getType()==ActivityType.BASKETBALL).
                mapToDouble(activity->activity.getDistance()).sum();

        double distanceHiking= activities.stream().filter(activity -> activity.getType()==ActivityType.HIKING).
                mapToDouble(activity->activity.getDistance()).sum();

        double distanceRunning= activities.stream().filter(activity -> activity.getType()==ActivityType.RUNNING).
                mapToDouble(activity->activity.getDistance()).sum();

        double distanceBiking= activities.stream().filter(activity -> activity.getType()==ActivityType.BIKING).
                mapToDouble(activity->activity.getDistance()).sum();

        result.add(new Report(ActivityType.BIKING,distanceBiking));
        result.add(new Report(ActivityType.HIKING,distanceHiking));
        result.add(new Report(ActivityType.RUNNING,distanceRunning));
        result.add(new Report(ActivityType.BASKETBALL,distanceBasketball));

        return result;
    }

    public int numberOfTrackActivities(){
        return (int) activities.stream().filter(a->a instanceof ActivityWithTrack).count();
    }

    public int numberOfWithoutTrackActivities(){
       return activities.size()-numberOfTrackActivities();
    }
}
