package com.hello.jdbcdemo;

import org.springframework.jdbc.core.JdbcTemplate;

import javax.sql.DataSource;
import java.util.List;

public class UserJDBCTemplate implements UserDAO {
    private DataSource dataSource;
    private JdbcTemplate jdbcTemplate;

    public void setDataSource(DataSource dataSource) {
        this.dataSource = dataSource;
        this.jdbcTemplate = new JdbcTemplate(dataSource);
    }
    public void create(String firstName, String lastName, String email) {
        String rawSql = "insert into users (first_name, last_name, email) values (?, ?, ?)";
        jdbcTemplate.update( rawSql, firstName, lastName, email);
        System.out.println("Created Record firstName = " + firstName + " lastName = " + lastName + " email = " + email);
        return;
    }
    public User getUser(Long id) {
        String rawSql = "select * from users" +
                " where id = ?";
        User user = jdbcTemplate.queryForObject(rawSql,
                new Object[]{id}, new UserMapper());

        return user;
    }
    public List<User> listUsers() {
        String rawSql = "select * from users";
        List <User> users = jdbcTemplate.query(rawSql, new UserMapper());
        return users;
    }
    public void delete(Long id) {
        String rawSql = "delete from users where id = ?";
        jdbcTemplate.update(rawSql, id);
        System.out.println("Deleted Record with ID = " + id );
    }
    public void update(Long id, String lastName){
        String rawSql = "update users set last_name = ? where id = ?";
        jdbcTemplate.update(rawSql, lastName, id);
        System.out.println("Updated Record with ID = " + id );
    }
}
