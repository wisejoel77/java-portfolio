package com.wisejoel77.EmployeeSalaryCalculator;

public class FullTimeEmployee extends Employee{
    // Fields
    protected double monthlySalary;

    // Constructors
    public FullTimeEmployee(String name, double monthlySalary){
        super(name);
        setMonthlySalary(monthlySalary);
    }

    // Setter Methods
    public void setMonthlySalary(double monthlySalary){
        if(monthlySalary < 0){
            System.out.println("Monthly salary cannot be negative");
        } else {
            this.monthlySalary = monthlySalary;
        }
    }

    // Utility Methods
    @Override
    public double calculateSalary(){
        return monthlySalary;
    }
}
