package action;

import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.ModelDriven;
import models.User;
import org.apache.struts2.ServletActionContext;
import service.LoginService;

import java.io.IOException;

public class LoginAction extends ActionSupport  implements ModelDriven<User>{


    private User user = new User();


    public String login() throws IOException {
        ServletActionContext.getResponse().setHeader("Access-Control-Allow-Origin", "*");
        System.out.println("触发方法了！");
        LoginService service = new LoginService();
//        User user = new User();
//        HttpServletRequest request = ServletActionContext.getRequest();
//        user.setUsername(request.getParameter("username"));
//        user.setPassword(request.getParameter("password"));
        System.out.println("用户信息：" + user.getUsername() + " " + user.getPassword());
        boolean result = service.login(user);
        if (result) {
            System.out.println("登录成功！");
            ServletActionContext.getResponse().getWriter().write("success!!!");
            return null;
        } else {
            System.out.println("登录失败！");
            ServletActionContext.getResponse().getWriter().write("fail!!!");
            return null;
        }
    }

    @Override
    public User getModel() {
        return user;
    }
}
