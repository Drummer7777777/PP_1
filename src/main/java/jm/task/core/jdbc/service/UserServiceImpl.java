package jm.task.core.jdbc.service;

import jm.task.core.jdbc.dao.UserDaoHibernateImpl;
import jm.task.core.jdbc.dao.UserDao;
import jm.task.core.jdbc.dao.UserDaoJDBCImpl;
import jm.task.core.jdbc.model.User;

import java.sql.SQLException;
import java.util.List;

public class UserServiceImpl implements UserService {
    private UserDao userDaoHibernate = new UserDaoHibernateImpl(); {
    };
    public void createUsersTable() throws SQLException {
        userDaoHibernate.createUsersTable();
    }

    public void dropUsersTable() {
        userDaoHibernate.dropUsersTable();
    }

    public void saveUser(String name, String lastName, byte age) {
        userDaoHibernate.saveUser(name, lastName, age);
    }

    public void removeUserById(long id) {
        userDaoHibernate.removeUserById(id);
    }

    public List<User> getAllUsers() {
        userDaoHibernate.getAllUsers();
        return null;
    }

    public void cleanUsersTable() {
        userDaoHibernate.cleanUsersTable();
    }
}
