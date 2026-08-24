package com.wisejoel77.LambdaExpressions.DiscountPricingSystem;

import java.util.Scanner;

public class DiscountPricingSystem {
    static double calculatePrice(double price, PriceCalculator object){
        return object.calculatePrice(price);
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the product price: ");
        double price = scanner.nextDouble();
        System.out.println("======= Prices according to discount =======");
        System.out.println("10%: " + calculatePrice(price, (a) -> a - (a * 0.1)));
        System.out.println("20%: " + calculatePrice(price, (a) -> a - (a * 0.2)));
        System.out.println("30%: " + calculatePrice(price, (a) -> a - (a * 0.3)));
        scanner.close();
    }
}
