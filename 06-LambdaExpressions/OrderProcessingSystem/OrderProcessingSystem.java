package com.wisejoel77.LambdaExpressions.OrderProcessingSystem;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.function.Consumer;

public class OrderProcessingSystem {
    public static void main(String[] args){
        ArrayList<Order> orders = new ArrayList<>(Arrays.asList(
                new Order("ORDER001", "Arnold", 500),
                new Order("ORDER002", "Joel", 999),
                new Order("ORDER003", "Joshua", 1499),
                new Order("ORDER004", "Matangi", 1999)
        ));

        Consumer<Order> orderConfirmation = order -> System.out.println("#" + order.orderId + " confirmed for " + order.customerName);
        Consumer<Order> invoiceGeneration = order -> {
            System.out.println("----- Invoice Generated -----");
            System.out.println("Order ID: " + order.orderId);
            System.out.println("Amount: $" + order.totalAmount);
        };
        Consumer<Order> shippingProcessor = order -> System.out.println("Order #" + order.orderId + " sent to shipping\n");

        Consumer<Order> autoWork = orderConfirmation.andThen(invoiceGeneration).andThen(shippingProcessor);

        orders.forEach(autoWork);
    }
}
