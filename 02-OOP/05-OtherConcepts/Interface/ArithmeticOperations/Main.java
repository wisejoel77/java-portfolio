package com.wisejoel77.interfaces.performingarithmeticoperations;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        boolean repeat = true;
        while(repeat) {
            System.out.println("Available Operations: 1. Addition, 2. Subtraction, 3.Multiplication, 4.Division");
            System.out.print("Please choose an operation: ");
            int choice = scanner.nextInt();
            if (choice < 1 || choice > 4) {
                System.out.println("Invalid Choice");
            } else {
                System.out.print("Please enter num1: ");
                int num1 = scanner.nextInt();
                System.out.print("Please enter num2: ");
                int num2 = scanner.nextInt();
                ArithmeticOperations operations;
                switch (choice) {
                    case 1:
                        operations = new Addition();
                        System.out.println("The sum is: " + operations.calculate(num1, num2));
                        break;

                    case 2:
                        operations = new Subtraction();
                        System.out.println("The difference is: " + operations.calculate(num1, num2));
                        break;

                    case 3:
                        operations = new Multiplication();
                        System.out.println("The product is: " + operations.calculate(num1, num2));
                        break;

                    case 4:
                        operations = new Division();
                        System.out.println("The quotient is: " + operations.calculate(num1, num2));
                        break;
                }
            }
            System.out.println("Do you want to use the program again? 1. Yes, 2. No");
            System.out.print("Enter your decision: ");
            int repeatChoice = scanner.nextInt();
            if(repeatChoice == 2){
                repeat = false;
                System.out.println("Thank you for using my program.");
            }
        }
    }
}
