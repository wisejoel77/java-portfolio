package com.wisejoel77.FileIO.EmployeeReportGenerator;

import java.io.BufferedOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class EmployeeReportGenerator {
    public static void main(String[] args){
        try (Scanner scanner = new Scanner(System.in);
             BufferedOutputStream bufferedOutputStream = new BufferedOutputStream(new FileOutputStream("src\\com\\wisejoel77\\FileIO\\EmployeeReportGenerator\\outputFile.txt"))){
            System.out.println("Welcome to Employee Report Generator: ");
            System.out.print("Enter your employee ID: ");
            String empId = scanner.nextLine();
            System.out.print("Enter your full name: ");
            String fullName = scanner.nextLine();
            System.out.print("Enter your department: ");
            String department = scanner.nextLine();
            System.out.print("Enter your designation: ");
            String designation = scanner.nextLine();
            System.out.print("Enter your salary: ");
            double salary = scanner.nextDouble();
            System.out.println("Generating the report...");
            String data = "Employee ID: " + empId + "\nFull Name: " + fullName + "\nDepartment: " + department + "\nDesignation: " + designation + "\nSalary: €" + salary;
            bufferedOutputStream.write(data.getBytes());
            System.out.println("Report generated successfully. Check it in outputFile.txt");
        } catch (IOException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Program finished");
        }
    }
}
