package com.example.demo1.category;

import com.example.demo1.product.Product;
import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Data
@Table(name="category")
public class Category {

    @Id
    @GeneratedValue
    @Column(name = "categoryId")
    Long categoryId;

    String description;

    @OneToMany(fetch = FetchType.LAZY, mappedBy = "category")
    List<Product> products = new ArrayList<Product>();

}
