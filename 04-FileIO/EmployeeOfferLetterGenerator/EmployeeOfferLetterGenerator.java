package com.wisejoel77.FileIO.EmployeeOfferLetterGenerator;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class EmployeeOfferLetterGenerator {
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in);
             FileWriter fileWriter = new FileWriter("src\\com\\wisejoel77\\FileIO\\EmployeeOfferLetterGenerator\\OfferLetter.txt")){
            System.out.println("##### Welcome to Offer Letter Generator #####");
            System.out.print("Enter your Employee ID: ");
            String empId = scanner.nextLine();
            System.out.print("Enter your full name: ");
            String name = scanner.nextLine();
            System.out.print("Enter your department: ");
            String department = scanner.nextLine();
            System.out.print("Enter your designation: ");
            String designation = scanner.nextLine();
            System.out.print("Enter your annual salary: ");
            double salary = scanner.nextDouble();
            System.out.println("Generating the offer letter...");

            String line1 = "==================================================\n";
            String line2 = "             WISE ORGANIZATION\n";
            String line3 = "           OFFICIAL OFFER LETTER\n";
            String line4 = "==================================================\n\n";
            String line5 = "Dear " + name + ",\n\n";
            String line6 = "Congratulations!\n\n";
            String line7 = "We are pleased to offer you the position of " + designation + " at Wise Organization.\n\n";
            String line8 = "Employee Details\n";
            String line9 = "--------------------------------------------------\n";
            String line10 = "Employee ID      : " + empId + "\n";
            String line11 = "Full Name        : " + name + "\n";
            String line12 = "Designation      : " + designation + "\n";
            String line13 = "Department       : " + department + "\n";
            String line14 = "Annual Salary    : $" + salary + "\n\n";
            String line15 = "We are confident that your skills and experience\n" + "will be a valuable addition to our team. We look\n" + "forward to working with you and wish you a\n" + "successful career at Wise Organization.\n\n";
            String line16 = "Please report to the Human Resources department\n" + "on your joining date with the required documents.\n\n";
            String line17 = "Welcome aboard!\n\n";
            String line18 = "Sincerely,\n\n";
            String line19 = "Human Resources Department\n";
            String line20 = "Wise Organization\n";
            String line21 = "==================================================";

            String offerLetter = line1 + line2 + line3 + line4 + line5 + line6 + line7 + line8 + line9 + line10 + line11 + line12 + line13 + line14 + line15 + line16 + line17 + line18 + line19 + line20 + line21;

            fileWriter.write(offerLetter);

            System.out.println("Offer Letter generated successfully");
        } catch (IOException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Program finished");
        }
    }
}
