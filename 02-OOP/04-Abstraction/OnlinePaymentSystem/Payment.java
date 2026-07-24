package com.wisejoel77.OnlinePaymentSystem;

public abstract class Payment {
    // Fields
    protected double amount;
    boolean paymentProcessed = true;

    // Constructors
    public Payment(double amount){
        setAmount(amount);
    }

    // Setter Methods
    public void setAmount(double amount){
        if(amount < 0){
            System.out.println("Amount cannot be negative");
        } else {
            this.amount = amount;
        }
    }

    // Getter Methods
    public double getAmount(){
        return amount;
    }

    // Abstract Methods
    public abstract void pay(double amount);

    // Concrete Methods
    public void processPayment(double amount){
        if(this.amount < amount){
            System.out.println("Insufficient Balance, cannot pay");
            paymentProcessed = false;
        } else {
            this.amount -= amount;
            paymentProcessed = true;
        }
    }

    public void displayAmount(){
        System.out.println("Balance: $" + getAmount());
    }
}
