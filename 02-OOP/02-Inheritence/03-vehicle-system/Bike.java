package com.wisejoel77.inheritence.vehicleSystem;

public class Bike extends Vehicle{
    // Constructors
    public Bike(String brand, String model, double speed){
        super(brand, model, speed);
    }

    // Utility Methods
    @Override
    public void start(){
        System.out.println("Bike starts with self/kick");
    }
}
