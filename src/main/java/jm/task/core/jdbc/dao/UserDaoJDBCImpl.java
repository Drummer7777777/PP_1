package main.java.jm.task.core.jdbc.dao;

//import main.java.jm.task.core.jdbc.model.User;
import main.java.jm.task.core.jdbc.util.Util;

import java.sql.Connection;
import java.sql.SQLException;
import java.sql.SQLSyntaxErrorException;
import java.sql.Statement;
import java.util.List;

import static java.sql.DriverManager.getConnection;

public class UserDaoJDBCImpl implements UserDao {
    Connection connection = Util.getConnection();
    public UserDaoJDBCImpl() {

    }

    public void createUsersTable() {
        try (Connection connection = Util.getConnection();
        Statement statement = connection.createStatement();
        ) {
            String sql = "CREATE TABLE `test`.`users` (\n" +
                    "  `id` INT NOT NULL,\n" +
                    "  `name` VARCHAR(45) NULL,\n" +
                    "  `lastName` VARCHAR(45) NULL,\n" +
                    "  `age` INT NULL,\n" +
                    "  PRIMARY KEY (`id`));";
            statement.executeUpdate(sql);
        } catch (SQLSyntaxErrorException e) {
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }

    public void dropUsersTable() {

    }

    public void saveUser(String name, String lastName, byte age) {

    }

    public void removeUserById(long id) {

    }

//    public List<User> getAllUsers() {
//        return null;
//    }

    public void cleanUsersTable() {

    }
}
