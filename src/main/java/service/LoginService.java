package service;

import dao.LoginDao;
import models.User;

public class LoginService {
    public boolean login(User user) {
        // TODO Auto-generated method stub
        LoginDao dao =new LoginDao();
        return dao.login(user);
    }
}
