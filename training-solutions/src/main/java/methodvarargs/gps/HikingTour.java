package methodvarargs.gps;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class HikingTour {

    List<FieldPoint> fieldPoints = new ArrayList<>();

    public List<FieldPoint> getFieldPoints() {
        return fieldPoints;
    }

    public void logFieldPoints(LocalDateTime timeOfLogging, FieldPoint... fieldPointsToLog) {
        for (FieldPoint f : fieldPointsToLog) {
            f.setTimeOfLogging(timeOfLogging);
            fieldPoints.add(f);
        }
        if (timeOfLogging == null) {
            throw new IllegalArgumentException("Time of logging must not be null!");
        }
    }
}
