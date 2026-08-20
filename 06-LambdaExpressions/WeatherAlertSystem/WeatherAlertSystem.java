package com.wisejoel77.LambdaExpressions.WeatherAlertSystem;

import java.util.Scanner;

public class WeatherAlertSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("======= Weather Alert System (°C) =======");
        System.out.print("Enter today's temperature: ");
        double temperature = scanner.nextDouble();
        TemperatureAlert object = new TemperatureAlert(){
            @Override
            public boolean checkHeatWaveStatus(double temperature){
                return temperature >= 45;
            }
        };
        if(!object.checkHeatWaveStatus(temperature)){
            System.out.println("Not a heat wave");
        } else {
            System.out.println("Alert: Heat wave! Stay indoors");
        }
        scanner.close();
    }
}
