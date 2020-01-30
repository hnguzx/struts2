package action;

import com.opensymphony.xwork2.ActionContext;
import com.opensymphony.xwork2.ActionSupport;
import com.opensymphony.xwork2.util.ValueStack;

public class OgnlAction extends ActionSupport {
    @Override
    public String execute() throws Exception {
        //获取valueStack
         //1.通过request获取
//        Object valueStack =  ServletActionContext.getRequest().getAttribute(ServletActionContext.STRUTS_VALUESTACK_KEY);
//        System.out.println(valueStack);
        //2.通过actionContext获取
        ValueStack valueStack1 = ActionContext.getContext().getValueStack();
        valueStack1.push("valueStack--value");
        valueStack1.set("name","谷志雄");
        return SUCCESS;
    }
}
