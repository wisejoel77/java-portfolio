package com.wisejoel77.LambdaExpressions.StudentEligibilityChecker;

import java.util.Scanner;
import java.util.function.Predicate;

public class StudentEligibilityChecker {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your grade percentage: ");
        double percentage = scanner.nextDouble();
        Predicate<Double> predicate = percent -> percent >= 60;
        if(predicate.test(percentage)){
            System.out.print("You are eligible for scholarship");
        } else {
            System.out.print("Sorry, you are not eligible for the scholarship");
        }
        scanner.close();
    }
}
