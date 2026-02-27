package com.wisejoel77.encapsulation.product;

public class Product {
    // Fields
    private String productName;
    private String productId;
    private double price;
    private double discount; // Discount in percentage

    // Constructors
    public Product(String productName, String productId, double price, double discount){
        setProductName(productName);
        setProductId(productId);
        setPrice(price);
        setDiscount(discount);
    }

    public Product(String productName, String productId, double price){
        this(productName, productId, price, 0);
    }

    // Getter methods
    public String getProductName(){
        return productName;
    }

    public String getProductId(){
        return productId;
    }

    public double getPrice(){
        return price;
    }

    public double getDiscount(){
        return discount;
    }

    // Setter Methods
    private void setProductId(String productId){
        if(productId == null || productId.isBlank()){
            System.out.println("Product ID cannot be null or blank.");
        } else {
            this.productId = productId;
        }
    }

    private void setProductName(String productName){
        if(productName == null || productName.isBlank()){
            System.out.println("Product name cannot be null or blank.");
        } else {
            this.productName = productName;
        }
    }

    public void setPrice(double price){
        if(price < 0){
            System.out.println("Price cannot be negative.");
        } else {
            this.price = price;
        }
    }

    public void setDiscount(double discount){
        if(discount < 0 || discount > 100){
            System.out.println("Discount must be between 0 and 100.");
        } else {
            this.discount = discount;
        }
    }

    // Utility methods
    public double getFinalPrice(){
        return price * ((100 - discount) / 100);
    }

    public void displayProductDetails(){
        System.out.println("=============== PRODUCT DETAILS ===============");
        System.out.println("Name: " + getProductName());
        System.out.println("ID: " + getProductId());
        System.out.println("Price: $" + String.format("%,.2f", getPrice()));
        System.out.println("Discount: " + getDiscount() + "%");
    }
}
