package dao;

import models.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {
    public boolean login(User user) {
        // TODO Auto-generated method stub
        String url = "jdbc:mysql://localhost:3306/dg_exercise1?useSSL=false&serverTimezone=UTC";
        String username = "root";
        String password = "Gzx970712";
        String usernameString = "";

        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            String sqlString = "SELECT * FROM user WHERE username=? AND password=?";
            PreparedStatement statement = connection.prepareStatement(sqlString);
            statement.setString(1, user.getUsername());
            statement.setString(2, user.getPassword());
            ResultSet set = statement.executeQuery();
            while (set.next()) {
                System.out.println("通过数据库查询到数据："+set.getString("username"));
                usernameString = set.getString("username");
            }
            if (usernameString.equals(user.getUsername())) {
                return true;
            }
            set.close();
            connection.close();
            statement.close();
        } catch (Exception e) {
            e.printStackTrace();
        }

        return false;
    }

}
