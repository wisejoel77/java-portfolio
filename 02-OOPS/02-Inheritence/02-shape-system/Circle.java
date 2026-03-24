package com.wisejoel77.inheritence.shapeSystem;

public class Circle extends Shape{
    // Fields
    protected double radius;

    // Constructors
    public Circle(double radius){
        super("Circle");
        setRadius(radius);
    }

    // Setter Methods
    public void setRadius(double radius){
        if(radius < 0){
            System.out.println("Radius cannot be negative");
            this.radius = 0;
        } else {
            this.radius = radius;
        }
    }

    // Getter Methods
    public double getRadius(){
        return radius;
    }

    // Utility Methods
    @Override
    public double calculateArea(){
        return Math.PI * Math.pow(radius,2);
    }

    @Override
    public void displayShapeDetails(){
        super.displayShapeDetails();
        System.out.println("Radius: " + getRadius());
        System.out.printf("Area: %.2f\n" , calculateArea());
        System.out.println();
    }
}
