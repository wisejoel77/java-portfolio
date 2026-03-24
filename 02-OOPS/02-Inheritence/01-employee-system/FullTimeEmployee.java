package com.wisejoel77.inheritence.employeeSystem;

public class FullTimeEmployee extends Employee{
    // Fields
    protected double bonus;

    // Constructors
    public FullTimeEmployee(String name, String employeeId, double baseSalary, double bonus){
        super(name, employeeId, baseSalary);
        this.bonus = bonus;
    }

    // Utility Methods
    @Override
    public double calculateSalary(){
        return baseSalary + bonus;
    }

    @Override
    public void displayEmployeeDetails(){
        super.displayEmployeeDetails();
        System.out.println("Final salary: " + calculateSalary());
        System.out.println();
    }
}
