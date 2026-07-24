package com.wisejoel77.inheritence.vehicleSystem;

public class Truck extends Vehicle{
    // Constructors
    public Truck(String brand, String model, double speed){
        super(brand, model, speed);
    }

    // Utility Methods
    @Override
    public void start(){
        System.out.println("Truck starts with heavy engine ignition");
    }
}
