package com.hello.jdbcdemo;

import javax.sql.DataSource;
import java.util.List;

public interface UserDAO {
    /**
     * This is the method to be used to initialize
     * database resources ie. connection.
     */
    public void setDataSource(DataSource ds);

    /**
     * This is the method to be used to create a record in the User table.
     */
    public void create(String firstName, String lastName, String email);

    /**
     * This is the method to be used to list down a record from the User table corresponding
     * to a passed User id.
     */
    public User getUser(Long id);

    /**
     * This is the method to be used to list down all the records from the User table.
     */
    public List<User> listUsers();

    /**
     * This is the method to be used to delete a record from the User table corresponding
     * to a passed User id.
     */
    public void delete(Long id);

    /**
     * This is the method to be used to update a record into the User table.
     */
    public void update(Long id, String lastName);
}
