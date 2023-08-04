package com.study;

import javax.persistence.*;
import java.util.List;

@Entity(name = "product")
@Table(name = "tbl_product")
@Access(AccessType.PROPERTY)
public class Product {

    @Id
    @Column(name = "product_num")
    private int productNum;

    @Column(name = "product_name", unique = true)
    private String productName;

    @Column(name = "productPrice")
    private int productPrice;

    @OneToMany(mappedBy = "product")
    private List<OrderMapping> orderMappingList;

    public Product() {
    }

    public Product(int productNum, String productName, int productPrice) {
        this.productNum = productNum;
        this.productName = productName;
        this.productPrice = productPrice;
    }

    public int getProductNum() {
        return productNum;
    }

    public void setProductNum(int productNum) {
        this.productNum = productNum;
    }

    public String getProductName() {
        return productName;
    }

    public void setProductName(String productName) {
        this.productName = productName;
    }

    public int getProductPrice() {
        return Integer.parseInt(productPrice + "원");
    }

    public void setProductPrice(int productPrice) {
        this.productPrice = productPrice;
    }

    @Override
    public String toString() {
        return "Product{" +
                "productNum=" + productNum +
                ", productName='" + productName + '\'' +
                ", productPrice=" + productPrice +
                '}';
    }
}
