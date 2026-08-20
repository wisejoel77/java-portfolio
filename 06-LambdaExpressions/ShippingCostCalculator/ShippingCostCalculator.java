package com.wisejoel77.LambdaExpressions.ShippingCostCalculator;

import java.util.Scanner;

public class ShippingCostCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("======= Shipping Cost Calculator (KG) =======");
        System.out.print("Enter the wight: " );
        int weight = scanner.nextInt();
        ShippingCalculator object = finalWeight -> {
            if(finalWeight <= 2) return 5;
            else return 5 + (finalWeight-2) * 2;
        };
        System.out.print("Final shipping cost: " + object.calculateCost(weight));
        scanner.close();
    }
}
