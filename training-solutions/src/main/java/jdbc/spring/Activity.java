package jdbc.spring;

import java.time.LocalDateTime;
import java.util.List;


public class Activity {

    private int id;
    private LocalDateTime startTime;
    private String desc;
    private ActivityType type;
   //List<TrackPoint> trackpoints;

    public Activity(int id, LocalDateTime startTime, String desc, ActivityType type) {
        this.id = id;
        this.startTime = startTime;
        this.desc = desc;
        this.type = type;
    }

    public int getId() {
        return id;
    }

    public LocalDateTime getStartTime() {
        return startTime;
    }

    public String getDesc() {
        return desc;
    }

    public ActivityType getType() {
        return type;
    }


}
