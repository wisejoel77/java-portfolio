package com.wisejoel77.LambdaExpressions.ShippingCostCalculator;

@FunctionalInterface
public interface ShippingCalculator {
    int calculateCost(int weight);
}
