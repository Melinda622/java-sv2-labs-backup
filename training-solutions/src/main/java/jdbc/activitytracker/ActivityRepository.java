package jdbc.activitytracker;

import javax.sql.DataSource;
import java.sql.*;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.List;

public class ActivityRepository {

    private DataSource dataSource;

    public ActivityRepository(DataSource dataSource) {
        this.dataSource = dataSource;
    }



   /* public void saveActivity(Activity activity) {

        try (Connection connection = dataSource.getConnection();
             PreparedStatement stmt = connection.prepareStatement("insert into activities(start_time,activity_desc,activity_type) values(?,?,?)")) {
            stmt.setTimestamp(1, Timestamp.valueOf(activity.getStartTime()));
            stmt.setString(2, activity.getDesc());
            stmt.setString(3, ActivityType.HIKING.name());
            stmt.execute();

        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot insert");
        }
    }*/

    private Activity insertActivity(Activity activity) {
        try (Connection connection = dataSource.getConnection();
             PreparedStatement stmt = connection.prepareStatement("insert into activities(start_time,activity_desc,activity_type) values(?,?,?)",
                     Statement.RETURN_GENERATED_KEYS)) {
            stmt.setTimestamp(1, Timestamp.valueOf(activity.getStartTime()));
            stmt.setString(2, activity.getDesc());
            stmt.setString(3, ActivityType.HIKING.name());
            stmt.executeUpdate();

            try (ResultSet rs = stmt.getGeneratedKeys()) {
                if (rs.next()) {
                    int id = rs.getInt("id");
                    return new Activity(id, activity.getStartTime(), activity.getDesc(), activity.getType());
                }
                throw new IllegalStateException("Error by inserting");
            }

        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot insert");
        }
    }

    public void saveActivity(TrackPoint trackPoint, Activity activity) {
        try (Connection connection = dataSource.getConnection()) {
            connection.setAutoCommit(false);

            try (PreparedStatement stmt = connection.prepareStatement("insert into track_point (time,lat,lon,activities_id) values(?,?,?,?)")) {
                if (trackPoint.getLat() > 90 || trackPoint.getLat() < -90
                        && trackPoint.getLon() < 180 || trackPoint.getLon() > 180) {
                    throw new IllegalArgumentException("Invalid longitude or latitude");
                }
                stmt.setDate(1, Date.valueOf(trackPoint.getTime()));
                stmt.setInt(2, trackPoint.getLat());
                stmt.setInt(3, trackPoint.getLon());
                int activityId = insertActivity(activity).getId();
                stmt.setInt(4, activityId);
                stmt.executeUpdate();
                connection.commit();

            } catch (IllegalArgumentException iae) {
                connection.rollback();
            }

        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot insert");
        }
    }

    public Activity findActivityById(int id) {
        Activity activity;
        try (Connection connection = dataSource.getConnection();
             PreparedStatement stmt = connection.prepareStatement("select * from activities where id=?")) {
            stmt.setInt(1, id);
            stmt.execute();
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    int activityId = rs.getInt("id");
                    LocalDateTime dateTime = rs.getTimestamp("start_time").toLocalDateTime();
                    String description = rs.getString("activity_desc");
                    ActivityType type = ActivityType.valueOf(rs.getString("activity_type"));
                    //activity = new Activity(activityId, dateTime, description, type);
                    findTrackPointByActivityId(activityId);
                    return activity = new Activity(activityId, dateTime, description, type);
                }
                throw new IllegalArgumentException("This activity does not exist");
            }
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot find", sqle);
        }
    }


    private TrackPoint findTrackPointByActivityId(int activityId) {
        TrackPoint trackPoint;
        try (Connection connection = dataSource.getConnection();
             PreparedStatement stmt = connection.prepareStatement("select * from track_point where activities_id=?")) {
            stmt.setInt(1, activityId);
            stmt.execute();
            try (ResultSet rs = stmt.executeQuery()) {
                if (rs.next()) {
                    int id = rs.getInt("id");
                    LocalDate time = rs.getDate("time").toLocalDate();
                    int lat = rs.getInt("lat");
                    int lon=rs.getInt("lon");
                    return trackPoint = new TrackPoint(id,time,lat,lon);
                }
                throw new IllegalArgumentException("This trackpoint does not exist");
            }
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot find", sqle);
        }
    }

    public List<Activity> listActivities() {
        List<Activity> result = new ArrayList<>();
        Activity activity;
        try (Connection connection = dataSource.getConnection();
             Statement stmt = connection.createStatement();
             ResultSet rs = stmt.executeQuery("select * from activities")) {
            while (rs.next()) {
                int activityId = rs.getInt("id");
                LocalDateTime dateTime = rs.getTimestamp("start_time").toLocalDateTime();
                String description = rs.getString("activity_desc");
                ActivityType type = ActivityType.valueOf(rs.getString("activity_type"));
                activity = new Activity(activityId, dateTime, description, type);
                result.add(activity);
            }
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot find", sqle);
        }
        return result;
    }
}
