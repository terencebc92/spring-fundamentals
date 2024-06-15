package com.hello.jdbcstoredproceduredemo;

import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.MapSqlParameterSource;
import org.springframework.jdbc.core.namedparam.SqlParameterSource;
import org.springframework.jdbc.core.simple.SimpleJdbcCall;

import javax.sql.DataSource;
import java.util.List;
import java.util.Map;

public class UserJDBCTemplate implements UserDAO {
    private DataSource dataSource;
    private SimpleJdbcCall jdbcCall;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcCall = new SimpleJdbcCall(dataSource).withProcedureName("getRecord");
    }
    public void create(String firstName, String lastName, String email) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);
        String rawSql = "insert into users (first_name, last_name, email) values (?, ?, ?)";
        jdbcTemplate.update( rawSql, firstName, lastName, email);
        System.out.println("Created Record firstName = " + firstName + " lastName = " + lastName + " email = " + email);
    }
    public User getUser(Long id) {
        SqlParameterSource in = new MapSqlParameterSource()
                .addValue("in_id", id);
        Map<String, Object> out = jdbcCall.execute(in);

        User user = new User();
        user.setId(id);
        user.setFirstName((String) out.get("out_first_name"));
        user.setLastName((String) out.get("out_last_name"));
        user.setEmail((String) out.get("out_email"));
        return user;
    }
    public List<User> listUsers() {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        String rawSql = "select * from users";
        List <User> users = jdbcTemplate.query(rawSql, new UserMapper());
        return users;
    }
    public void delete(Long id) {
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        String rawSql = "delete from users where id = ?";
        jdbcTemplate.update(rawSql, id);
        System.out.println("Deleted Record with ID = " + id );
    }
    public void update(Long id, String lastName){
        JdbcTemplate jdbcTemplate = new JdbcTemplate(dataSource);

        String rawSql = "update users set last_name = ? where id = ?";
        jdbcTemplate.update(rawSql, lastName, id);
        System.out.println("Updated Record with ID = " + id );
    }
}
