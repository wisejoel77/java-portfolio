package com.wisejoel77.LambdaExpressions.OrderNotificationSystem;

public class Order {
    // Fields
    String orderId;
    String customerName;
    double totalAmount;

    // Constructors
    public Order(String orderId, String customerName, double totalAmount){
        this.orderId = orderId;
        this.customerName = customerName;
        this.totalAmount = totalAmount;
    }
}
