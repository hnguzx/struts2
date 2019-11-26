package action;

import com.opensymphony.xwork2.ActionSupport;

public class Demo extends ActionSupport {
    public String demo(){
        System.out.println("访问成功！");
        return null;
    }
}
