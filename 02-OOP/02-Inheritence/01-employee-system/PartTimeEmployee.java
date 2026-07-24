package com.wisejoel77.inheritence.employeeSystem;

public class PartTimeEmployee extends Employee{
    // Fields
    protected double hoursWorked;
    protected double hourlyRate;

    // Constructors
    public PartTimeEmployee(String name, String employeeId, double hoursWorked, double hourlyRate){
        super(name, employeeId, 0);
        this.hoursWorked = hoursWorked;
        this.hourlyRate = hourlyRate;
    }

    // Utility Methods
    @Override
    public double calculateSalary(){
        return hoursWorked * hourlyRate;
    }

    @Override
    public void displayEmployeeDetails(){
        super.displayEmployeeDetails();
        System.out.println("Final salary: " + calculateSalary());
        System.out.println();
    }
}
