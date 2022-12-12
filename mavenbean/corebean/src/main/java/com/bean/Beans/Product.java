package com.bean.Beans;

import org.springframework.stereotype.Component;

@Component
public class Product {
    private String productName;
    private int productPrice;
//
    public Product() {
    }

/*we know that while creating stereotype annotation we don't have much control on Bean creation and so
* but we can use @PostConstruct method to execute a method  with some value.which will get executed after Construction of the
* Bean SPring ioc Container
* Spring borrow this @PostContruct method from Java EE*/
//@PostContruct
//public void initialize(){
//    this.setProductName("Jakarta");
//}

    public String getProductName() {
        return productName;
    }


    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return productPrice;
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }




    @Override
    public String toString() {
        return "Product{" +
                "productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }
}
