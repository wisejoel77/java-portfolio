package com.wisejoel77.encapsulation.product;

public class Main {
    public static void main(String[] args){
        // Valid entry example
        Product p1 = new Product("Chocolate Box", "PID001", 149, 5);
        p1.displayProductDetails();
        System.out.println("Final Price: $" + String.format("%.2f",p1.getFinalPrice()));
        System.out.println();

        // Invalid entry example
        Product p2 = new Product(null, "PID002", 999, 15);
        Product p3 = new Product("Laptop", "PID003", 2499, 1000);
        Product p4 = new Product("Bench", "PID004", -2499, 50);
    }
}
