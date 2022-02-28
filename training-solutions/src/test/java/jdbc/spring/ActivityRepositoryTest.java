package jdbc.spring;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.time.LocalDateTime;
import java.util.Arrays;

import static org.junit.jupiter.api.Assertions.*;

class ActivityRepositoryTest {

    ActivityRepository activityRepository;

    @BeforeEach
    public void init(){

        MariaDbDataSource dataSource=new MariaDbDataSource();
        try {
            dataSource.setUrl("jdbc:mariadb://localhost:3306/activitytracker?useUnicode=true");
            dataSource.setUserName("root");
            dataSource.setPassword("Hungary84");
        } catch (
                SQLException sqle) {
            throw new IllegalStateException("Cannot insert",sqle);
        }

        Flyway flyway = Flyway.configure().dataSource(dataSource).load();

        flyway.clean();
        flyway.migrate();

        activityRepository =new ActivityRepository(dataSource);

    }

    @Test
    void testInsert(){
        Activity activity= new Activity
                (0, LocalDateTime.of(2022,02,22,22,22),"hiking in the alps", ActivityType.HIKING);
        activityRepository.saveActivity(activity);
    }

    @Test
     void testListAllActivities(){
        Activity activity= new Activity
                (0, LocalDateTime.of(2022,02,22,22,22),"hiking in the alps", ActivityType.HIKING);
        Activity activity2= new Activity
                (0, LocalDateTime.of(2022,02,20,22,22),"biking around the lake", ActivityType.BIKING);
        activityRepository.saveActivity(activity);
        activityRepository.saveActivity(activity2);
        assertEquals(Arrays.asList("hiking in the alps","biking around the lake"),activityRepository.ListAllActivities());
    }

    @Test
    void findActivityById() {
        Activity activity= new Activity
                (0, LocalDateTime.of(2022,02,22,22,22),"hiking in the alps", ActivityType.HIKING);
        Activity activity2= new Activity
                (0, LocalDateTime.of(2022,02,20,22,22),"biking around the lake", ActivityType.BIKING);
        activityRepository.saveActivity(activity);
        activityRepository.saveActivity(activity2);
        System.out.println(activityRepository.findActivityById(1).getDesc());
    }
}