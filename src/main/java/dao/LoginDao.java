package dao;

import models.User;
import org.apache.commons.dbutils.QueryRunner;
import org.apache.commons.dbutils.handlers.BeanHandler;
import org.apache.commons.dbutils.handlers.BeanListHandler;
import utils.DataSourceUtils;
import utils.Log4jUtil;

import java.sql.SQLException;
import java.util.List;

public class LoginDao {

//    String url = "jdbc:mysql://180.76.58.205:3306/dg_exercise1?useSSL=false&serverTimezone=UTC&allowPublicKeyRetrieval=true";
////    String username = "root";
////    String password = "Guzx@123";

    public User login(User user) throws SQLException {
//        String usernameString = "";
//        try {
//            Class.forName("com.mysql.cj.jdbc.Driver");
//            Connection connection = DriverManager.getConnection(url, username, password);
//            String sqlString = "SELECT * FROM user WHERE username=? AND password=?";

        String sql = "select * from user where username=? and password=?";

        QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
        return runner.query(sql, new BeanHandler<User>(User.class), user.getUsername(),
                user.getPassword());

//            PreparedStatement statement = connection.prepareStatement(sqlString);
//            statement.setString(1, user.getUsername());
//            statement.setString(2, user.getPassword());
//            ResultSet set = statement.executeQuery();
//            while (set.next()) {
//                System.out.println("通过数据库查询到数据：" + set.getString("username"));
//                usernameString = set.getString("username");
//            }
//            if (usernameString.equals(user.getUsername())) {
//                return true;
//            }
//            set.close();
//            connection.close();
//            statement.close();
//        } catch (Exception e) {
//            e.printStackTrace();
//        }

//        return false;
    }

    public List<User> getUserList() throws SQLException {
        String sql = "select * from user";
        Log4jUtil.getLogger().info("获取所有用户信息");
        QueryRunner runner = new QueryRunner(DataSourceUtils.getDataSource());
        return runner.query(sql, new BeanListHandler<User>(User.class));
    }
}
