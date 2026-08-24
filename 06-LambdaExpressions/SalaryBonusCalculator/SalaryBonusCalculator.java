package com.wisejoel77.LambdaExpressions.SalaryBonusCalculator;

import java.util.Scanner;

public class SalaryBonusCalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter salary: ");
        double salary = scanner.nextDouble();
        System.out.print("Enter current bonus percentage: ");
        double bonusPercentage = scanner.nextDouble();
        double bonus = calculateBonus(salary, a -> a * (bonusPercentage / 100));
        double finalSalary = salary + bonus;
        System.out.println("======= Final Details =======");
        System.out.println("Salary: " + salary);
        System.out.println("Bonus percentage: " + bonusPercentage);
        System.out.println("Bonus: " + bonus);
        System.out.println("Final salary: " + finalSalary);
    }

    static double calculateBonus(double salary, BonusCalculator object){
        return object.calculateBonus(salary);
    }
}
