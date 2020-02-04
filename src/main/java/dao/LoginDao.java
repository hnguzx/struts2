package dao;

import models.User;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;

public class LoginDao {

    String url = "jdbc:mysql://180.76.58.205:3306/dg_exercise1?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
    String username = "root";
    String password = "Guzx@123";

    public boolean login(User user) {
        String usernameString = "";
        System.out.println("调用了dao");
        try {
            Class.forName("com.mysql.cj.jdbc.Driver");
            Connection connection = DriverManager.getConnection(url, username, password);
            String sqlString = "SELECT * FROM user WHERE username=? AND password=?";
            PreparedStatement statement = connection.prepareStatement(sqlString);
            statement.setString(1, user.getUsername());
            statement.setString(2, user.getPassword());
            ResultSet set = statement.executeQuery();
            while (set.next()) {
                System.out.println("通过数据库查询到数据：" + set.getString("username"));
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
