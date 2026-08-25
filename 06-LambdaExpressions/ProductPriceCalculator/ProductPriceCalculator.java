package com.wisejoel77.LambdaExpressions.ProductPriceCalculator;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class ProductPriceCalculator {
    public static void main(String[] args){
        ArrayList<Product> products = new ArrayList<>(List.of(
                new Product("Laptop", 5999),
                new Product("Adapter", 19),
                new Product("Chair", 249),
                new Product("Washing Machine", 999),
                new Product("Standing Desk", 599),
                new Product("Shirt", 49)
        ));
        ArrayList<Double> discountedPrices = new ArrayList<>();

        Function<Product, Double> calculatePrice = product -> product.price - (product.price * 0.15);

        for(Product product: products){
            discountedPrices.add(calculatePrice.apply(product));
        }

        System.out.println("Discounted Prices: " + discountedPrices);
    }
}
