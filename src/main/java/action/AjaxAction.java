package action;

import com.opensymphony.xwork2.ActionSupport;
import models.Product;

import java.util.ArrayList;
import java.util.List;

public class AjaxAction extends ActionSupport {
    private List<Product> products;
    private String code;

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
}
