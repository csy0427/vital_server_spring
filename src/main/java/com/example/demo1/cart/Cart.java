package com.example.demo1.cart;


import com.example.demo1.accounts.Account;
import com.example.demo1.productList.ProductList;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Getter
@Setter
@Table(name = "cart")
public class Cart {

    @Column(name="cartId")
    Long cartId;


    Account account;

    @Column(name="total")
    BigInteger total;


    List<ProductList> productList=new ArrayList<>();

    @Column(name = "createDate")
    Date createDate;

    @Id
    @GeneratedValue
    public Long getCartId() {
        return cartId;
    }

    public void setCartId(Long cartId) {
        this.cartId = cartId;
    }

    @OneToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="userid")
    public Account getAccount() {
        return account;
    }

    public void setAccount(Account account) {
        this.account = account;
    }

    public BigInteger getTotal() {
        return total;
    }

    public void setTotal(BigInteger total) {
        this.total = total;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "cart")
    public List<ProductList> getProductList() {
        return productList;
    }

    public void setProductList(List<ProductList> productList) {
        this.productList = productList;
    }


    public Date getCreateDate() {
        return createDate;
    }

    public void setCreateDate(Date createDate) {
        this.createDate = createDate;
    }
}
