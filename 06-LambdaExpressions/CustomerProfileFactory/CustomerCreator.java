package com.wisejoel77.LambdaExpressions.CustomerProfileFactory;

@FunctionalInterface
public interface CustomerCreator {
    Customer createCustomer(String name);
}
