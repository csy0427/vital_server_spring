package com.example.demo1.accounts;

import com.example.demo1.cart.Cart;
import com.example.demo1.order.Order;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Entity
@Data
@Getter
@Setter
@Table(name = "account")
public class Account {


    private Long userid;

    @Column(unique = true, name="username")
    private  String username;

    @Column(name="userpw")
    private String userpw;

    @Column(name="useremail")
    private String useremail;

    private  String fullName;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="userjoined")
    private Date joined;

    @Temporal(TemporalType.TIMESTAMP)
    @Column(name="userupdated")
    private Date updated;

    @Column(name = "isadmin")
    private boolean isadmin;

    Cart cart;


    List<Order> orders=new ArrayList<>();


    @Id
    @GeneratedValue
    public Long getUserid() {
        return userid;
    }

    public void setUserid(Long userid) {
        this.userid = userid;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getUserpw() {
        return userpw;
    }

    public void setUserpw(String userpw) {
        this.userpw = userpw;
    }

    public String getUseremail() {
        return useremail;
    }

    public void setUseremail(String useremail) {
        this.useremail = useremail;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

    public Date getJoined() {
        return joined;
    }

    public void setJoined(Date joined) {
        this.joined = joined;
    }

    public Date getUpdated() {
        return updated;
    }

    public void setUpdated(Date updated) {
        this.updated = updated;
    }

    public boolean isIsadmin() {
        return isadmin;
    }

    public void setIsadmin(boolean isadmin) {
        this.isadmin = isadmin;
    }

    @OneToOne(fetch = FetchType.LAZY,mappedBy = "account")
    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "account")
    public List<Order> getOrders() {
        return orders;
    }

    public void setOrders(List<Order> orders) {
        this.orders = orders;
    }



}
