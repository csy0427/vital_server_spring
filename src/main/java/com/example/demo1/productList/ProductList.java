package com.example.demo1.productList;


import com.example.demo1.cart.Cart;
import com.example.demo1.order.Order;
import com.example.demo1.product.Product;
import lombok.Data;

import javax.persistence.*;


@Entity
@Data
@Table(name="product_list")
public class ProductList {

    @Id
    @GeneratedValue
    Long productListId;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="cartId",nullable = false)
    Cart cart;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="productId",nullable = false)
    Product product;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name="orderId",nullable = false)
    Order order;

    Long quantity;

    Long price;

    public Long getProductListId() {
        return productListId;
    }

    public void setProductListId(Long productListId) {
        this.productListId = productListId;
    }

    public Cart getCart() {
        return cart;
    }

    public void setCart(Cart cart) {
        this.cart = cart;
    }

    public Product getProduct() {
        return product;
    }

    public void setProduct(Product product) {
        this.product = product;
    }

    public Order getOrder() {
        return order;
    }

    public void setOrder(Order order) {
        this.order = order;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }
}
