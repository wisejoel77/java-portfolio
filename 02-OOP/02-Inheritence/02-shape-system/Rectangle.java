package com.wisejoel77.inheritence.shapeSystem;

public class Rectangle extends Shape{
    // Fields
    protected double length;
    protected double width;

    // Constructors
    public Rectangle(double length, double width){
        super("Rectangle");
        setLength(length);
        setWidth(width);
    }

    // Setter Methods
    public void setLength(double length){
        if(length < 0){
            System.out.println("Length cannot be negative");
            this.length = 0;
        } else {
            this.length = length;
        }
    }

    public void setWidth(double width){
        if(width < 0){
            System.out.println("Width cannot be negative");
            this.width = 0;
        } else {
            this.width = width;
        }
    }

    // Getter Methods
    public double getLength(){
        return length;
    }

    public double getWidth(){
        return width;
    }

    // Utility Methods
    @Override
    public double calculateArea(){
        return length * width;
    }

    @Override
    public void displayShapeDetails(){
        super.displayShapeDetails();
        System.out.println("Length: " + getLength());
        System.out.println("Width: " + getWidth());
        System.out.printf("Area: %.2f\n" , calculateArea());
        System.out.println();
    }
}
