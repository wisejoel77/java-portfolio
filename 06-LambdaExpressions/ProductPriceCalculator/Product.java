package com.wisejoel77.LambdaExpressions.ProductPriceCalculator;

public class Product {
    // Fields
    String productName;
    double price;

    // Constructors
    public Product(String productName, double price){
        this.productName = productName;
        this.price = price;
    }

    @Override
    public String toString(){
        return "{Product Name: " + productName + " | Price: " + price + "}";
    }
}
