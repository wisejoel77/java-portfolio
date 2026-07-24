package com.wisejoel77.FileIO.EmployeeRecordExporter;

import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class EmployeeRecordExporter {
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in); FileOutputStream fileOutputStream = new FileOutputStream("src\\com\\wisejoel77\\FileIO\\EmployeeRecordExporter\\file.txt")) {
            System.out.println("##### Welcome to Employee Record Exporter #####");
            System.out.print("Enter your Employee ID: ");
            String empId = scanner.nextLine();
            System.out.print("Enter your full name: ");
            String name = scanner.nextLine();
            System.out.print("Enter your department: ");
            String department = scanner.nextLine();
            System.out.print("Enter your email: ");
            String email = scanner.nextLine();
            System.out.println();
            System.out.println("Exporting the employee information to a text file...");
            String information = "Employee ID: " + empId + "\nFull Name: " + name + "\nDepartment: " + department + "\nEmail: " + email + "\n";
            fileOutputStream.write(information.getBytes());
            System.out.println("Export successful");
        } catch (IOException e) {
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("Program finished");
        }
    }
}
