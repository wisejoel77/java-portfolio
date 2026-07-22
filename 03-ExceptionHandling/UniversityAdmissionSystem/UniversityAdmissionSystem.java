package com.wisejoel77.ExceptionHandling.UniversityAdmissionSystem;

import java.util.Scanner;

public class UniversityAdmissionSystem {

    public final static double requiredCGPA = 7.0;

    public static  void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Welcome to Wise University Admissions Department");
        System.out.print("Please enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Please enter your CGPA: ");
        double cgpa = scanner.nextDouble();
        try {
            checkEligibility(cgpa);
            System.out.println("Admission approved.");
            System.out.println("Your classes will start from Monday.");
        } catch (InvalidCGPAException e){
            System.out.println(e.getMessage());
            System.out.println("Try again next time");
        } finally {
            scanner.close();
            System.out.println("Thank you, visit again.");
        }
    }

    public static void checkEligibility(double cgpa) throws InvalidCGPAException{
        if(cgpa < requiredCGPA) {
            throw new InvalidCGPAException("Sorry, you did not meet the required CGPA.");
        }
    }
}
