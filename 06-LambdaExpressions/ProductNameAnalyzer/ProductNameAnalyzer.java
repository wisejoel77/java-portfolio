package com.wisejoel77.LambdaExpressions.ProductNameAnalyzer;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;

public class ProductNameAnalyzer {
    public static void main(String[] args){
        ArrayList<String> products = new ArrayList<>(Arrays.asList(
                "Wireless Mouse",
                "Mechanical Keyboard",
                "USB-C Hub",
                "Gaming Headset",
                "Laptop Stand",
                "Webcam",
                "Bluetooth Speaker",
                "External SSD",
                "Smartwatch",
                "Power Bank"
        ));
        System.out.println("Products: " + products);
        products.sort(String::compareTo);
        System.out.println("======= After ordering =======");
        System.out.println("Products: " + products);
    }
}
