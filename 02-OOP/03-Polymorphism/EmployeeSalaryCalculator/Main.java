package com.wisejoel77.EmployeeSalaryCalculator;

public class Main {
    public static void main(String[] args){
        // Creating two employees
        Employee[] employees = new Employee[2];
        employees[0] = new FullTimeEmployee("Arnold", 50000);
        employees[1] = new PartTimeEmployee("Joel", 80, 15.5);

        // Calculating and printing salaries
        for(Employee employee: employees){
            System.out.println(employee.getName() + " earns $" + employee.calculateSalary());
        }
    }
}
