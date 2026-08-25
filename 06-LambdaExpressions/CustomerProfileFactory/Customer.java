package com.wisejoel77.LambdaExpressions.CustomerProfileFactory;

public class Customer {
    // Fields
    String name;
    int orders;

    // Constructors
    public Customer(String name){
        this.name = name;
        orders = 0;
    }

    // Utility Methods
    void display(){
        System.out.println("======= Customer Details =======");
        System.out.println("Name: " + name);
        System.out.println("Orders: " + orders);
    }
}
