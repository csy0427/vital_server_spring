package com.example.demo1.order;

import com.example.demo1.accounts.Account;
import com.example.demo1.productList.ProductList;
import lombok.Data;

import javax.persistence.*;
import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Table(name = "order")
public class Order {

    @Column(name="orderId")
    Long orderId;


    Account account;

    @Column(name="orderDate",nullable = false, length = 20)
    Date orderDate;

    //"delivered","stock","prepared","finished","canceled"
    @Column(name= "orderStatus")
    String status;

    @Column(name="total")
    BigDecimal total;


    List<ProductList> productList= new ArrayList<>();


    @Id
    @GeneratedValue
    public Long getOrderId() {
        return orderId;
    }

    public void setOrderId(Long orderId) {
        this.orderId = orderId;
    }

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="userid",nullable = false)
    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public Date getOrderDate() {
        return orderDate;
    }

    public void setOrderDate(Date orderDate) {
        this.orderDate = orderDate;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public BigDecimal getTotal() {
        return total;
    }

    public void setTotal(BigDecimal total) {
        this.total = total;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "order")
    public List<ProductList> getProductList() {
        return productList;
    }

    public void setProductList(List<ProductList> productList) {
        this.productList = productList;
    }
}
