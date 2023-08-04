package com.study;

import javax.persistence.*;
import java.util.Date;

@Entity(name = "order")
@Table(name = "tbl_order")
public class Order {

    @Id
    @Column(name = "order_no")
    private int orderNo; // 주문번호
    @Column(name = "order_status")
    private String orderStatus; // 주문상태
    @Column(name = "order_date")
    @Temporal(TemporalType.DATE)
    private Date orderDate; // 주문일
    @Column(name = "order_update_date")
    @Temporal(TemporalType.DATE)
    private Date orderUpdateDate; // 주문 수정일
    @Column(name = "order_remove_date")
    @Temporal(TemporalType.DATE)
    private Date orderRemoveDate; // 주문 삭제일

    public Order() {
    }

    public Order(int orderNo, String orderStatus, Date orderDate, Date orderUpdateDate, Date orderRemoveDate) {
        this.orderNo = orderNo;
        this.orderStatus = orderStatus;
        this.orderDate = orderDate;
        this.orderUpdateDate = orderUpdateDate;
        this.orderRemoveDate = orderRemoveDate;
    }

    public int getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(int orderNo) {
        this.orderNo = orderNo;
    }

    public String getOrderStatus() {
        return orderStatus;
    }

    public void setOrderStatus(String orderStatus) {
        this.orderStatus = orderStatus;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public Date getOrderUpdateDate() {
        return orderUpdateDate;
    }

    public void setOrderUpdateDate(Date orderUpdateDate) {
        this.orderUpdateDate = orderUpdateDate;
    }

    public Date getOrderRemoveDate() {
        return orderRemoveDate;
    }

    public void setOrderRemoveDate(Date orderRemoveDate) {
        this.orderRemoveDate = orderRemoveDate;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNo=" + orderNo +
                ", orderStatus='" + orderStatus + '\'' +
                ", orderDate=" + orderDate +
                ", orderUpdateDate=" + orderUpdateDate +
                ", orderRemoveDate=" + orderRemoveDate +
                '}';
    }
}
