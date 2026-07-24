package com.wisejoel77.EmployeeSalaryCalculator;

public class PartTimeEmployee extends Employee{
    // Fields
    protected int hoursWorked;
    protected double hourlyRate;

    // Constructors
    public PartTimeEmployee(String name, int hoursWorked, double hourlyRate){
        super(name);
        setHoursWorked(hoursWorked);
        setHourlyRate(hourlyRate);
    }

    // Setter Methods
    public void setHoursWorked(int hoursWorked){
        if(hoursWorked < 0){
            System.out.println("Hours worked cannot be negative");
        } else {
            this.hoursWorked = hoursWorked;
        }
    }

    public void setHourlyRate(double hourlyRate){
        if(hourlyRate < 0){
            System.out.println("Hourly rate cannot be negative");
        } else {
            this.hourlyRate = hourlyRate;
        }
    }

    // Utility Methods
    @Override
    public double calculateSalary(){
        return hourlyRate * hoursWorked;
    }
}
