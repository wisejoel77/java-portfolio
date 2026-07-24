package com.wisejoel77.inheritence.vehicleSystem;

public class Main {
    public static void main(String[] args){
        // Vehicle
        Vehicle v1 = new Vehicle("Bugatti", "Chiron Super Sport 300+", 490);
        System.out.println("Vehicle Example");
        v1.start();
        v1.accelerate();
        v1.stop();
        v1.displayDetails();

        // Car Example
        Vehicle c1 = new Car("Lamborghini", "Aventador SVJ", 350);
        System.out.println("Car Example");
        c1.start();
        c1.accelerate();
        c1.stop();
        c1.displayDetails();

        // Bike Example
        Vehicle b1 = new Bike("Kawasaki", "Ninja H2R", 400);
        System.out.println("Bike Example");
        b1.start();
        b1.accelerate();
        b1.stop();
        b1.displayDetails();

        // Truck Example
        Vehicle t1 = new Truck("Volvo", "FH16", 120);
        System.out.println("Truck Example");
        t1.start();
        t1.accelerate();
        t1.stop();
        t1.displayDetails();
    }
}
