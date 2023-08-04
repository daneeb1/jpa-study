package com.study;

import javax.persistence.*;

@Entity(name = "order_mapping")
@Table(name = "tbl_order_mapping")
public class OrderMapping {

    @EmbeddedId
    private OrderPk orderPk;
    @ManyToOne
    @JoinColumn(name = "order_num")
    private Order order;

    @ManyToOne
    @JoinColumn(name = "product")
    private Product product;

    public OrderMapping() {
    }

    public OrderMapping(OrderPk orderPk, Order order, Product product) {
        this.orderPk = orderPk;
        this.order = order;
        this.product = product;
    }

    public OrderPk getOrderPk() {
        return orderPk;
    }

    public void setOrderPk(OrderPk orderPk) {
        this.orderPk = orderPk;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    @Override
    public String toString() {
        return "OrderMapping{" +
                "orderPk=" + orderPk +
                ", order=" + order +
                ", product=" + product +
                '}';
    }
}
