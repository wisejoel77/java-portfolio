package com.wisejoel77.LambdaExpressions.DiscountPricingSystem;

@FunctionalInterface
public interface PriceCalculator {
    double calculatePrice(double price);
}
