package com.wisejoel77.OnlinePaymentSystem;

public class CreditCard extends Payment{
    // Constructors
    public CreditCard(double amount){
        super(amount);
    }

    // Abstract Methods Implementation
    @Override
    public void pay(double amount){
        processPayment(amount);
        if(paymentProcessed) {
            System.out.println("Paid using Credit Card");
        }
    }
}
