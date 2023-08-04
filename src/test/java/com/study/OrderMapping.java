package com.study;

import javax.persistence.Column;
import javax.persistence.EmbeddedId;
import javax.persistence.Entity;
import javax.persistence.Table;

@Entity(name = "order_mapping")
@Table(name = "tbl_order_mapping")
public class OrderMapping {

    @EmbeddedId
    private OrderPk orderPk;
    @Column
    private int orderNum;
    @Column
    private int productNum;

    public OrderMapping() {
    }

    public OrderMapping(OrderPk orderPk, int orderNum, int productNum) {
        this.orderPk = orderPk;
        this.orderNum = orderNum;
        this.productNum = productNum;
    }

    public OrderPk getOrderPk() {
        return orderPk;
    }

    public void setOrderPk(OrderPk orderPk) {
        this.orderPk = orderPk;
    }

    public int getOrderNum() {
        return orderNum;
    }

    public void setOrderNum(int orderNum) {
        this.orderNum = orderNum;
    }

    public int getProductNum() {
        return productNum;
    }

    public void setProductNum(int productNum) {
        this.productNum = productNum;
    }

    @Override
    public String toString() {
        return "OrderMapping{" +
                "orderPk=" + orderPk +
                ", orderNum=" + orderNum +
                ", productNum=" + productNum +
                '}';
    }
}
