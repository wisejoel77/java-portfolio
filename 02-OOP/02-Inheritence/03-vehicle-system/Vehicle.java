package com.wisejoel77.inheritence.vehicleSystem;

public class Vehicle {
    // Fields
    protected String brand;
    protected String model;
    protected double speed;

    // Constructors
    public Vehicle(String brand, String model, double speed){
        setBrand(brand);
        setModel(model);
        setSpeed(speed);
    }

    // Setter Methods
    public void setBrand(String brand){
        if(brand == null || brand.isBlank()){
            System.out.println("Brand cannot be null or blank");
            this.brand = "Not set";
        } else {
            this.brand = brand;
        }
    }

    public void setModel(String model){
        if(model == null || model.isBlank()){
            System.out.println("Model cannot be null or blank");
            this.model = "Not set";
        } else {
            this.model = model;
        }
    }

    public void setSpeed(double speed){
        if(speed < 0){
            System.out.println("Speed cannot be negative");
            this.speed = 0;
        } else {
            this.speed = speed;
        }
    }

    // Getter Methods
    public String getBrand(){
        return brand;
    }

    public String getModel(){
        return model;
    }

    public double getSpeed(){
        return speed;
    }

    // Utility Methods
    public void start(){
        System.out.println("Vehicle is starting...");
    }

    public void stop(){
        System.out.println("Vehicle stopped");
    }

    public void displayDetails(){
        System.out.println("========== Details ==========");
        System.out.println("Brand: " + getBrand());
        System.out.println("Model: " + getModel());
        System.out.println("Speed: " + getSpeed());
        System.out.println();
    }

    public void accelerate(){
        System.out.println("Vehicle accelerating now");
    }
}
