package com.wisejoel77.LambdaExpressions.LoanInterestCalculator;

@FunctionalInterface
public interface InterestCalculator {
    double calculateInterest(int principalAmount, double interestRate, double time);
}
