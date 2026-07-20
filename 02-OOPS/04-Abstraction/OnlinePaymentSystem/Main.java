package com.wisejoel77.OnlinePaymentSystem;

public class Main {
    public static void main(String[] args){
        Payment[] payments = new Payment[3];
        payments[0] = new CreditCard(5000);
        payments[1] = new UPI(99999);
        payments[2] = new Cash(400);

        for(Payment payment: payments){
            payment.pay(2500);
        }
    }
}
