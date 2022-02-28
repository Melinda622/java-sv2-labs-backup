package jdbc.spring;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

import javax.sql.DataSource;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Timestamp;
import java.time.LocalDateTime;
import java.util.List;

public class ActivityRepository {

    private JdbcTemplate jdbcTemplate;

    public ActivityRepository(DataSource dataSource) {
        jdbcTemplate=new JdbcTemplate(dataSource);
    }

    public void saveActivity(Activity activity){

        Timestamp time=Timestamp.valueOf(activity.getStartTime());
        String description=activity.getDesc();
        String type= activity.getType().name();

        //jdbcTemplate.update("insert into activities (start_time,activity_desc,activity_type) values(?,?,?)",time,description,type);
        jdbcTemplate.update("insert into activities (start_time,activity_desc,activity_type) values(?,?,?)",activity.getStartTime(),activity.getDesc(),activity.getType().name());

    }

    public List<String> ListAllActivities(){
        return jdbcTemplate.query("select activity_desc from activities", new RowMapper<String>() {

            @Override
            public String mapRow(ResultSet rs, int rowNum) throws SQLException {
                return rs.getString("activity_desc");
            }
        });
    }

    /*public String findActivityById(int number) {
        return jdbcTemplate.queryForObject("select activity_desc from activities where id=?", new RowMapper<String>() {
            @Override
            public String mapRow(ResultSet rs, int rowNum) throws SQLException {
                return rs.getString("activity_desc");
            }
        },number);
    }
*/
    public Activity findActivityById(int number) {
        return jdbcTemplate.queryForObject("select * from activities where id=?",
                (rs, rowNum) -> new Activity(rs.getInt("id"),rs.getTimestamp("start_time").toLocalDateTime(),
                rs.getString("activity_desc"),ActivityType.valueOf( rs.getString("activity_type"))
               ),number);
    }
}
