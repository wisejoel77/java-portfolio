package com.wisejoel77.ExceptionHandling;

import java.util.Scanner;

// Basic Try and Catch
public class SafeIntegerDivision {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("##### Finding Quotient #####");
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        try{
            int result = num1 / num2;
            System.out.println("The quotient is " + result);
        } catch(ArithmeticException e){
            System.out.println("Error: Second number cannot be zero, please enter a valid number");
        }
        System.out.println("Program finished");
        scanner.close();
    }
}
