package interceptor;

import com.opensymphony.xwork2.Action;
import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionInvocation;
import com.opensymphony.xwork2.interceptor.AbstractInterceptor;
import utils.Log4jUtil;

import java.util.Map;

public class LoginInterceptor extends AbstractInterceptor {

    @Override
    public String intercept(ActionInvocation actionInvocation) throws Exception {
        //获取上下文对象
        ActionContext context = actionInvocation.getInvocationContext();
        //获取请求参数
        Map<String, Object> parameters = context.getParameters();
        //
        String username = ((String[]) (parameters.get("username")))[0];
        String password = ((String[]) (parameters.get("password")))[0];
        if (username.equals("gzx") && password.equals("123")) {
            Log4jUtil.getLogger().info("有权限！");
            context.getSession().put("username", username);
            actionInvocation.invoke();
        }else {
            System.out.println("不好意思，没有权限！！！！！！！");
        }
        Log4jUtil.getLogger().info("用户名：" + username + "密码：" + password);
        return Action.LOGIN;
    }

//    @Override
//    public void destroy() {
//
//    }
//
//    @Override
//    public void init() {
//        System.out.println("初始化");
//    }
//
//    @Override
//    public String intercept(ActionInvocation actionInvocation) throws Exception {
//        System.out.println("进行拦截");
//        actionInvocation.invoke();
//        return Action.LOGIN;
//        return null;
//    }
}
