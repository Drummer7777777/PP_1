package jm.task.core.jdbc;

import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.service.UserService;
import jm.task.core.jdbc.service.UserServiceImpl;

import java.sql.SQLException;

public class Main {
    public static void main(String[] args) throws SQLException {
        // реализуйте алгоритм здесь
        UserService userService = new UserServiceImpl();
        userService.createUsersTable();
        userService.saveUser("ALEX", "ALEXANDROV", (byte) 25);
        userService.saveUser("VLAD", "VLADOV", (byte) 2);
        userService.saveUser("IVAN", "IVANOV", (byte) 9);
        userService.saveUser("MICHAIL", "MICHAILOV", (byte) 33);
        userService.removeUserById(1);
        userService.getAllUsers();
        userService.cleanUsersTable();
        userService.dropUsersTable();
    }
}
