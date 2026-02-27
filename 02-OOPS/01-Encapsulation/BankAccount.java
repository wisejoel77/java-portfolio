package com.wisejoel77.encapsulation.bank;

/**
 * Represents a bank account demonstrating encapsulation.
 * Ensures controlled access to balance and validates all transactions.
 */

public class BankAccount {
    // Fields
    private String accountNumber;
    private String accountHolderName;
    private double balance;

    // Constructors
    public BankAccount(String accountNumber, String accountHolderName, double balance){
        if(accountNumber != null && !accountNumber.isBlank()) {
            this.accountNumber = accountNumber;
        } else {
            System.out.println("Account number cannot be blank.");
        }
        setAccountHolderName(accountHolderName);
        if(balance >=0) {
            this.balance = balance;
        } else {
            System.out.println("Balance cannot be negative.");
        }
    }

    // Getter methods
    public String getAccountNumber(){
        return accountNumber;
    }

    public String getAccountHolderName(){
        return accountHolderName;
    }

    public double getBalance(){
        return balance;
    }

    // Setter methods
    public void setAccountHolderName(String name){
        if(name != null && !name.isBlank()){
            accountHolderName = name;
        } else {
            System.out.println("Invalid name.");
        }
    }

    // Functional Methods
    public void deposit(double amount){
        if(amount<=0){
            System.out.println("Deposit amount must be positive.");
        } else {
            balance += amount;
        }
    }

    public void withdraw(double amount){
        // Accepts both positive and negative values; normalized using absolute value
        amount = Math.abs(amount);
        if(amount > balance){
            System.out.println("Insufficient balance for withdrawal.");
        } else {
            balance -= amount;
        }
    }

    public void displayAccountInfo(){
        System.out.println("=============== ACCOUNT INFO ===============");
        System.out.println("Account Holder Name: " + getAccountHolderName());
        System.out.println("Account Number: " + getAccountNumber());
        System.out.println("Balance: $" + String.format("%,.2f", getBalance()));
    }
}
