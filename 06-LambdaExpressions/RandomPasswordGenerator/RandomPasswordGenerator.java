package com.wisejoel77.LambdaExpressions.RandomPasswordGenerator;

import java.util.Random;
import java.util.Scanner;
import java.util.function.Supplier;

public class RandomPasswordGenerator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many random passwords do you want: ");
        int n = scanner.nextInt();
        Random random = new Random();
        Supplier<String> supplier = () -> {
            return String.valueOf(random.nextInt(10000-1000) + 1000 );
        };
        for(int i=1; i<=n; i++){
            System.out.println("password " + i + " is: " + supplier.get());
        }
        scanner.close();
    }
}
