package com.wisejoel77.LambdaExpressions.ProductFilterSystem;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ProductFilterSystem {
    public static void main(String[] args){
        ArrayList<Product> products = new ArrayList<>(List.of(
                new Product("Laptop", 2500, 440),
                new Product("Charger", 20, 250),
                new Product("Phone", 599, 140),
                new Product("Table", 100, 600),
                new Product("Chair", 25, 3000),
                new Product("Truck", 49000, 6),
                new Product("Trailer", 74000, 3)
        ));

        Predicate<Product> lessThan500 = Product -> Product.price < 500;
        Predicate<Product> atLeast10Units = Product -> Product.stockQuantity >= 10;
        Predicate<Product> moreThan500 = Product -> Product.price >= 500;
        Predicate<Product> lessThan500AndAtLeast10Units = lessThan500.and(atLeast10Units);
        Predicate<Product> moreThan500AndLessThan10Units = moreThan500.and(atLeast10Units.negate());

        System.out.println("Products list: " + products);
        ArrayList<Product> productsLessThan500 = new ArrayList<>();
        ArrayList<Product> productsAtLeast10Units = new ArrayList<>();
        ArrayList<Product> productsMoreThan500 = new ArrayList<>();
        ArrayList<Product> productsLessThan500AndAtLeast10Units = new ArrayList<>();
        ArrayList<Product> productsMoreThan500AndLessThan10Units = new ArrayList<>();

        for(Product product : products){
            if(lessThan500.test(product)){
                productsLessThan500.add(product);
            }
            if(atLeast10Units.test(product)){
                productsAtLeast10Units.add(product);
            }
            if(moreThan500.test(product)){
                productsMoreThan500.add(product);
            }
            if(lessThan500AndAtLeast10Units.test(product)){
                productsLessThan500AndAtLeast10Units.add(product);
            }
            if(moreThan500AndLessThan10Units.test(product)){
                productsMoreThan500AndLessThan10Units.add(product);
            }
        }

        System.out.println("======= After Analyzing =======");
        System.out.println("Products less than $500: " + productsLessThan500);
        System.out.println("Products with at least 10 units in stock: " + productsAtLeast10Units);
        System.out.println("Products more than $500: " + productsMoreThan500);
        System.out.println("Products less than $500 and are at least 10 in stock: " + productsLessThan500AndAtLeast10Units);
        System.out.println("Products more than $500 and are less than 10 in stock: " + productsMoreThan500AndLessThan10Units);
    }
}
