package com.wisejoel77.LambdaExpressions.OrderNotificationSystem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class OrderNotificationSystem {
    public static void main(String[] args){
        ArrayList<Order> orders = new ArrayList<>(Arrays.asList(
                new Order("ORDER001", "Arnold", 500),
                new Order("ORDER002", "Joel", 999),
                new Order("ORDER003", "Joshua", 1499),
                new Order("ORDER004", "Matangi", 1999)
        ));

        Consumer<Order> consumer = order -> {
            System.out.println("===== Order Notification =====");
            System.out.println("Order ID: " + order.orderId);
            System.out.println("Customer Name: " + order.customerName);
            System.out.println("Total Amount: " + order.totalAmount + "\n");
        };

        orders.forEach(consumer);
    }
}
