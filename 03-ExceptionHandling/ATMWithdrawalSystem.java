package com.wisejoel77.ExceptionHandling;

import java.util.Scanner;

// Showcasing throw and throws
public class ATMWithdrawalSystem {

    static int balance = 50000;

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the amount to withdraw: ");
        int amount = scanner.nextInt();
        try{
            withdrawMoney(amount);
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        }
        scanner.close();
    }

    public static void withdrawMoney(int amount) throws IllegalArgumentException{
        if(balance < amount){
            throw new IllegalArgumentException("Error: Balance not sufficient");
        } else {
            balance -= amount;
            System.out.println("Amount debited successfully. Remaining balance: " + balance);
        }
    }
}
