package com.wisejoel77.LambdaExpressions.ProductFilterSystem;

public class Product {
    // Fields
    String productName;
    double price;
    int stockQuantity;

    // Constructors
    public Product(String productName, double price, int stockQualtity){
        this.productName = productName;
        this.price = price;
        this.stockQuantity = stockQualtity;
    }

    @Override
    public String toString() {
        return "{Product Name: " + productName + " | Price: " + price + " | Quantity: " + stockQuantity + "}";
    }
}
