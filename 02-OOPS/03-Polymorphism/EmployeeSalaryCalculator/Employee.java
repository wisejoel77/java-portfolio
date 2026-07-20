package com.wisejoel77.EmployeeSalaryCalculator;

public class Employee {
    // Fields
    protected String name;

    // Constructors
    public Employee(String name){
        setName(name);
    }

    // Setter Methods
    public void setName(String name){
        if(name == null || name.isBlank()){
            System.out.println("Name cannot be null or blank");
        } else {
            this.name = name;
        }
    }

    // Getter Methods
    public String getName(){
        return name;
    }

    // Utility Methods
    public double calculateSalary(){
        return 0.0;
    }
}
