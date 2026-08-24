package com.wisejoel77.LambdaExpressions.TemperatureConverter;

import java.util.Scanner;

public class TemperatureConverterRunner {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("======= Temperature Converter °C to °F =======");
        System.out.print("Enter temperature in celsius: ");
        double celsius = scanner.nextDouble();
        TemperatureConverter object = TemperatureConverter:: calculateToFahrenheit;
        System.out.print("Temperature in Fahrenheit: " + object.temperatureConverter(celsius));
        scanner.close();
    }
}
