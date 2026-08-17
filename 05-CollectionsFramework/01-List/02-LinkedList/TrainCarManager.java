package com.wisejoel77.CollectionsFramework.LinkedList;

import java.util.LinkedList;
import java.util.List;

public class TrainCarManager {
    public static void main(String[] args){
        LinkedList<String> trainCars = new LinkedList<>(List.of("First Class Coach", "Second Class Coach", "Second Class Coach", "Dining Car", "Sleeper Coach"));
        System.out.println("Initial configuration: " + trainCars);
        trainCars.addFirst("Locomotive"); // Adding at the beginning
        trainCars.add("Brake Van"); // Adding at the end
        System.out.println("After adding two cars at the beginning and end: " + trainCars);
        trainCars.removeFirst();
        trainCars.removeLast();
        System.out.println("After removing first and last elements: " + trainCars);
        if(trainCars.contains("Dining Car")){
            System.out.println("Dining Car is available in this train");
        } else {
            System.out.println("Dining Car is not available in this train");
        }
        System.out.println("The size of train is: " + trainCars.size());
        System.out.print("Train configuration: ");
        for(String str: trainCars){
            System.out.print(str + ", ");
        }
        System.out.print("\b\b");
    }
}
