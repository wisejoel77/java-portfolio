package com.wisejoel77.inheritence.vehicleSystem;

public class Car extends Vehicle{
    // Constructors
    public Car(String brand, String model, double speed){
        super(brand, model, speed);
    }

    // Utility Methods
    @Override
    public void start(){
        System.out.println("Car starts with key ignition");
    }
}
