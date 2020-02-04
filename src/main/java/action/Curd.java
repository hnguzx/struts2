package action;

import com.opensymphony.xwork2.ActionSupport;

public class Curd extends ActionSupport {
    public String add(){
        System.out.println("新增方法！");
        return null;
    }

    public String check(){
        System.out.println("查看方法！");
        return null;
    }

    public String delete(){
        System.out.println("删除方法！");
        return null;
    }

    public String modify(){
        System.out.println("修改方法！");
        return null;
    }
}
