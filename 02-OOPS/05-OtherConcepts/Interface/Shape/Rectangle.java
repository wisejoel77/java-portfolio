package com.wisejoel77.interfaces.performingarithmeticoperations.areaofshapes;

public class Rectangle implements Shape{

    private double length;
    private double breadth;

    public Rectangle(double length, double breadth){
        this.length = length;
        this.breadth = breadth;
    }

    @Override
    public double calculateArea(){
        return length * breadth;
    }
}
