package com.wisejoel77.inheritence.employeeSystem;

public class Intern extends Employee{
    // Fields
    protected double stipend;

    // Constructors
    public Intern(String name, String employeeId, double stipend){
        super(name, employeeId, 0);
        this.stipend = stipend;
    }

    // Utility Methods
    @Override
    public double calculateSalary(){
        return stipend;
    }

    @Override
    public void displayEmployeeDetails(){
        super.displayEmployeeDetails();
        System.out.println("Final salary: " + calculateSalary());
        System.out.println();
    }
}
