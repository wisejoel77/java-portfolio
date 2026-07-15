package com.wisejoel77.interfaces.performingarithmeticoperations.areaofshapes;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        boolean repeat = true;
        while(repeat) {
            System.out.println("Available Shapes: 1. Circle, 2. Rectangle, 3.Triangle");
            System.out.print("Please enter the shape you want to calculate the area for: ");
            int choice = scanner.nextInt();
            Shape shape;
            switch (choice) {
                case 1:
                    System.out.print("Please enter the radius: ");
                    double radius = scanner.nextDouble();
                    shape = new Circle(radius);
                    System.out.println("The area is: " + shape.calculateArea());
                    break;

                case 2:
                    System.out.print("Please enter the length: ");
                    double length = scanner.nextDouble();
                    System.out.print("Please enter the breadth: ");
                    double breadth = scanner.nextDouble();
                    shape = new Rectangle(length, breadth);
                    System.out.println("The area is: " + shape.calculateArea());
                    break;

                case 3:
                    System.out.print("Please enter the base: ");
                    double base = scanner.nextDouble();
                    System.out.print("Please enter the height: ");
                    double height = scanner.nextDouble();
                    shape = new Triangle(base, height);
                    System.out.println("The area is: " + shape.calculateArea());
                    break;

                default:
                    System.out.println("Invalid Choice");
            }
            System.out.println("Do you want to continue using the program? 1. Yes, 2. No");
            System.out.print("Please enter your choice: ");
            int value = scanner.nextInt();
            if(value == 2){
                repeat = false;
                System.out.println("Thank you using my program");
            }
        }
    }
}
