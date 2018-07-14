package com.example.demo1.product;


import com.example.demo1.category.Category;
import com.example.demo1.productList.ProductList;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name="product")
public class Product {

    @Id
    @GeneratedValue
    Long productId;

    @Column(unique = true)
    String productName;

    @Column(name="productStock")
    Integer productStock;

    @ManyToOne(fetch = FetchType.LAZY)
    @JoinColumn(name = "categoryId")
    Category category;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "product")
    List<ProductList> productList= new ArrayList<>();



}
