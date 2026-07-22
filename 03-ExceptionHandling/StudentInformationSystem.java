package com.wisejoel77.ExceptionHandling;

import java.util.Scanner;

// Try with resources
public class StudentInformationSystem {
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in)){
            System.out.print("Enter your name: ");
            String name = scanner.nextLine();
            System.out.print("Enter your age: ");
            int age = Integer.parseInt(scanner.nextLine());
            if(age < 0){
                throw new IllegalArgumentException("Error: Invalid age, enter a valid age.");
            }
            System.out.print("Enter your course: ");
            String course = scanner.nextLine();
            System.out.println("Please verify your details: ");
            System.out.println("Name: " + name + "\nAge: " + age + "\nCourse: " + course);
        } catch (NumberFormatException e){
            System.out.println("Error: Enter an integer for age");
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Program finished");
        }
    }
}
