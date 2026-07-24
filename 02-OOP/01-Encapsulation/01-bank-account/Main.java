package com.wisejoel77.encapsulation.bank;

public class Main {
    public static void main(String[] args){
        // Valid entry example
        BankAccount a1 = new BankAccount("SBI00001", "Arnold Joel Joshua Matangi", 1_000_000);
        a1.displayAccountInfo();
        System.out.println();
        System.out.println("+++++ Transactions +++++");
        a1.deposit(500_000);
        System.out.println("After depositing: $" + String.format("%,.2f",a1.getBalance()));
        a1.withdraw(-1_499_999);
        System.out.println("After withdrawal: $" + String.format("%,.2f",a1.getBalance()));
        System.out.println();
        a1.displayAccountInfo();
        System.out.println();

        // Invalid entry examples
        System.out.println("+++++ INVALID ENTRY EXAMPLE +++++");
        BankAccount a2 = new BankAccount("SBI00002", "Alfred Zoe Matangi", -500_000);
        a2.setAccountHolderName("      ");
        a2.deposit(-100_000);
        a2.withdraw(1_000_000_000);
        System.out.println();
        a2.displayAccountInfo();
    }
}
