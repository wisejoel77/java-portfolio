package com.wisejoel77.inheritence.employeeSystem;

public class Employee {
    // Fields
    protected String name;
    protected String employeeId;
    protected double baseSalary;

    // Constructors
    public Employee(String name, String employeeId, double baseSalary){
        setName(name);
        setEmployeeId(employeeId);
        setBaseSalary(baseSalary);
    }

    // Getter Methods
    public String getName(){
        return name;
    }

    public String getEmployeeId(){
        return employeeId;
    }

    public double getBaseSalary(){
        return baseSalary;
    }

    // Setter Methods
    public void setName(String name){
        if(name == null || name.isBlank()){
            System.out.println("Name cannot be blank or null");
        } else {
            this.name = name;
        }
    }

    public void setEmployeeId(String employeeId){
        if(employeeId == null || employeeId.isBlank()){
            System.out.println("Employee ID cannot be blank or null");
        } else {
            this.employeeId = employeeId;
        }
    }

    public void setBaseSalary(double baseSalary){
        if(baseSalary < 0){
            System.out.println("Base salary cannot be negative");
            this.baseSalary = 0;
        } else {
            this.baseSalary = baseSalary;
        }
    }

    // Utility Methods
    public void displayEmployeeDetails(){
        System.out.println("Name: " + name);
        System.out.println("Employee ID: " + employeeId);
    }

    public double calculateSalary(){
        return baseSalary;
    }
}
