package com.wisejoel77.inheritence.shapeSystem;

public class Main {
    public static void main(String[] args){
        // Circle Example
        Shape s1 = new Circle(15);
        s1.displayShapeDetails();

        // Rectangle Example
        Shape s2 = new Rectangle(100, 200);
        s2.displayShapeDetails();
    }
}
