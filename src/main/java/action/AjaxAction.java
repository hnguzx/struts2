package action;

import com.opensymphony.xwork2.ActionSupport;
import models.Product;
import models.User;
import service.LoginService;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class AjaxAction extends ActionSupport {
    private List<Product> products;
    private String code;

    private List<User> users;

    public List<User> getUsers() {
        return users;
    }

    public void setUsers(List<User> users) {
        this.users = users;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public List<Product> getProducts() {
        return products;
    }

    public void setProducts(List<Product> products) {
        this.products = products;
    }

    @Override
    public String execute() throws Exception {
        products = new ArrayList<Product>();
        products.add(new Product(1, "电脑", 3500, 2));
        products.add(new Product(2, "被子", 200, 1));
        products.add(new Product(3, "女朋友", 999, 1));
        products.add(new Product(4, "室友", 999, 7));
        code = "00000";
        return SUCCESS;
    }

    public String user() throws SQLException {
        LoginService service = new LoginService();
        users = service.getUserList();
        return SUCCESS;
    }
}
