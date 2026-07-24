package com.wisejoel77.inheritence.employeeSystem;

public class Main {
    public static void main(String[] args){
        //Full Time Employee
        Employee e1 = new FullTimeEmployee("Arnold", "E001", 120_000, 40_000);
        System.out.println("The calculated salary of E001 is: " + e1.calculateSalary());
        e1.displayEmployeeDetails();

        //Part Time Employee
        Employee e2 = new PartTimeEmployee("Joel", "E002", 20, 25);
        System.out.println("The calculated salary of E002 is: " + e2.calculateSalary());
        e2.displayEmployeeDetails();

        //Intern
        Employee e3 = new Intern("Joshua", "E003", 2_500);
        System.out.println("The calculated salary of E003 is: " + e3.calculateSalary());
        e3.displayEmployeeDetails();
    }
}
