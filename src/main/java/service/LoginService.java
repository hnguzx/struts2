package service;

import dao.LoginDao;
import models.User;

import java.sql.SQLException;
import java.util.List;

public class LoginService {
    public User login(User user) throws SQLException {
        // TODO Auto-generated method stub
        LoginDao dao =new LoginDao();
        return dao.login(user);
    }

    public List<User> getUserList() throws SQLException {
        LoginDao dao =new LoginDao();
        return dao.getUserList();
    }
}
