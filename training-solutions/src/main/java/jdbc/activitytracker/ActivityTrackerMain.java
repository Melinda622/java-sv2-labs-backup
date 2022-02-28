package jdbc.activitytracker;

import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.*;
import java.time.LocalDateTime;

public class ActivityTrackerMain {

    public static void main(String[] args) {

        MariaDbDataSource dataSource=new MariaDbDataSource();
        try {
            dataSource.setUrl("jdbc:mariadb://localhost:3306/employees?useUnicode=true");
            dataSource.setUserName("root");
            dataSource.setPassword("Hungary84");
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot insert",sqle);
        }

        Activity hiking=new Activity(0, LocalDateTime.of(2022,3,22,10,32),"hiking in the alps",ActivityType.HIKING);


        /*try(Connection connection=dataSource.getConnection();
            Statement stmt=connection.createStatement()) {
            stmt.executeUpdate("insert into activities(start_time,activity_desc,activity_type) values('2022-2-2 10:34:00','hiking','hiking')");
        } catch (SQLException sqle) {
            throw new IllegalStateException("Cannot insert",sqle);
        }*/

        ActivityRepository activityRepository =new ActivityRepository(dataSource);
        //System.out.println(activityReposititory.saveActivity(hiking));
        //System.out.println(activityReposititory.findActivityById(5));
        //System.out.println(activityReposititory.listActivities());
    }

}
