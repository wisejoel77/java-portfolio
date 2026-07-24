package com.wisejoel77.OnlinePaymentSystem;

public class UPI extends Payment{
    // Constructors
    public UPI(double amount){
        super(amount);
    }

    // Implementing Abstract Methods
    public void pay(double amount){
        processPayment(amount);
        if(paymentProcessed) {
            System.out.println("Paid using UPI");
        }
    }
}
