package main.java.jm.task.core.jdbc;

import main.java.jm.task.core.jdbc.dao.UserDaoJDBCImpl;

public class Main {
    public static void main(String[] args) {
        // реализуйте алгоритм здесь
        UserDaoJDBCImpl userDaoJDBC = new UserDaoJDBCImpl();
        userDaoJDBC.createUsersTable();
        userDaoJDBC.saveUser("ALEX", "ALEXANDROV", (byte) 25);
        userDaoJDBC.saveUser("VLAD", "VLADOV", (byte) 2);
        userDaoJDBC.saveUser("IVAN", "IVANOV", (byte) 9);
        userDaoJDBC.saveUser("MICHAIL", "MICHAILOV", (byte) 33);
        userDaoJDBC.getAllUsers();
        userDaoJDBC.cleanUsersTable();
        userDaoJDBC.dropUsersTable();
//        userDaoJDBC.removeUserById(1);
    }
}
