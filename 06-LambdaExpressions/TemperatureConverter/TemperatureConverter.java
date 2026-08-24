package com.wisejoel77.LambdaExpressions.TemperatureConverter;

@FunctionalInterface
public interface TemperatureConverter {
    double temperatureConverter(double celsius);

    static double calculateToFahrenheit(double celsius){
        return (celsius * 9.0 / 5.0) + 32;
    }
}
