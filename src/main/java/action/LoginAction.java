package action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import models.User;
import org.apache.struts2.ServletActionContext;
import service.LoginService;
import utils.Log4jUtil;

import java.io.IOException;
import java.sql.SQLException;

public class LoginAction extends ActionSupport  implements ModelDriven<User>{


    private User user = new User();

    public String login() throws IOException, SQLException {
        Log4jUtil.getLogger().info("用户进行登录操作>>>>>>>>>>>>>>>>>>>>>>");
        ServletActionContext.getResponse().setHeader("Access-Control-Allow-Origin", "*");
        LoginService service = new LoginService();
        System.out.println("用户信息：" + user.getUsername() + " " + user.getPassword());
        User result = service.login(user);
        if (result != null) {
            System.out.println("登录成功！");
            Log4jUtil.getLogger().info(user);
            ActionContext.getContext().getSession().put("username", user.getUsername());
//            ServletActionContext.getResponse().getWriter().write("success!!!");
            return SUCCESS;
        } else {
            System.out.println("登录失败！");
//            ServletActionContext.getResponse().getWriter().write("fail!!!");
            return INPUT;
        }

    }

    @Override
    public void validate() {
        if(user.getUsername()==null || user.getUsername().trim().length()==0){
            this.addFieldError("user.message","用户名不能为空");
        }
        System.out.println("进行了校验");
    }

    @Override
    public User getModel() {
        return user;
    }

}
