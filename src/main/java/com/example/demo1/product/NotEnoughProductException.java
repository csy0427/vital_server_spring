package com.example.demo1.product;

public class NotEnoughProductException extends RuntimeException{

    private static final String DEFAULT_MESSAGE = "Not enough products in stock";

    public NotEnoughProductException() {
        super(DEFAULT_MESSAGE);
    }

    public NotEnoughProductException(Product product) {
        super(String.format("Not enough %s products in stock. Only %d left", product.getProductName(), product.getProductStock()));
    }
}
