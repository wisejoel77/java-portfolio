package com.wisejoel77.interfaces.performingarithmeticoperations;

public class Division implements ArithmeticOperations{
    @Override
    public double calculate(int a, int b){
        if(b==0){
            System.out.println("Cannot divide by zero");
            return -1;
        } else {
            return (double) a /b;
        }
    }
}
