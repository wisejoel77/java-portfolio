package com.wisejoel77.LambdaExpressions.LoanInterestCalculator;

import java.util.Scanner;

public class LoanInterestCalculator {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("======= Loan Interest Calculator =======");
        System.out.print("Enter principal amount: ");
        int principalAmount = scanner.nextInt();
        System.out.print("Enter interest rate: ");
        double interestRate = scanner.nextDouble();
        System.out.print("Enter time (in years): ");
        double time = scanner.nextDouble();
        InterestCalculator interestCalculator = (p, r, t) -> {
            return (p * t * r) / 100;
        };
        System.out.print("Simple interest: " + interestCalculator.calculateInterest(principalAmount, interestRate, time));
        scanner.close();
    }
}
