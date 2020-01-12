package action;

import com.opensymphony.xwork2.ActionSupport;
import org.apache.struts2.ServletActionContext;
import utils.Log4jUtil;

import java.io.IOException;

public class ValitaFail extends ActionSupport {
    public String fail() throws IOException {
        System.out.println("跳到这个方法！");
        Log4jUtil.getLogger().info("校验失败！");
        ServletActionContext.getResponse().getWriter().write("validate Fail");
        return null;
    }
}
