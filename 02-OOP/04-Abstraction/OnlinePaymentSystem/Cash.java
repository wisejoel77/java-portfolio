package com.wisejoel77.OnlinePaymentSystem;

public class Cash extends Payment{
    // Constructors
    public Cash(double amount){
        super(amount);
    }

    // Implementing Abstract Methods
    @Override
    public void pay(double amount){
        processPayment(amount);
        if(paymentProcessed) {
            System.out.println("Paid using Cash");
        }
    }
}
