package jdbc.activitytracker;

import org.flywaydb.core.Flyway;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.mariadb.jdbc.MariaDbDataSource;

import java.sql.SQLException;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.util.Collections;

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
    public void testInsert(){

    }


    @Test
    public void testSaveActivity(){
        TrackPoint trackPoint=new TrackPoint(1, LocalDate.of(2022,02,02),80,70);
        Activity activity=new Activity(0, LocalDateTime.of(2022,02,02,10,00),
                "hiking in the alps",ActivityType.HIKING);
        activityRepository.saveActivity(trackPoint,activity);
        assertEquals(ActivityType.HIKING, activityRepository.listActivities().get(0).getType());
    }

    @Test
    public void testSaveACtivityWithInvalidArguments(){
        TrackPoint trackPoint=new TrackPoint(1, LocalDate.of(2022,02,02),91,181);
        Activity activity=new Activity(0, LocalDateTime.of(2022,02,02,10,00),
                "hiking in the alps",ActivityType.HIKING);
        activityRepository.saveActivity(trackPoint,activity);
        assertEquals(Collections.emptyList(), activityRepository.listActivities());
    }

    @Test
    public void testfindActivityById(){
        TrackPoint trackPoint=new TrackPoint(1, LocalDate.of(2022,02,02),80,70);
        Activity activity=new Activity(0, LocalDateTime.of(2022,02,02,10,00),
                "hiking in the alps",ActivityType.HIKING);
        activityRepository.saveActivity(trackPoint,activity);
        activityRepository.findActivityById(1);
        assertEquals(LocalDateTime.of(2022,02,02,10,00),activityRepository.findActivityById(1).getStartTime());
    }

    /*@Test
    public void testfindTrackPointById(){
        TrackPoint trackPoint=new TrackPoint(1, LocalDate.of(2022,02,02),91,181);
        Activity activity=new Activity(0, LocalDateTime.of(2022,02,02,10,00),
                "hiking in the alps",ActivityType.HIKING);
        //activityReposititory.saveTrackPoint(trackPoint,activity);

        assertEquals(LocalDate.of(2022,02,02),activityReposititory.findTrackPointByActivityId(1).getTime());
    }*/



}