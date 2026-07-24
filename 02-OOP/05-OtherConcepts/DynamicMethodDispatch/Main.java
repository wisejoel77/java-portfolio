package com.wisejoel77.dynamicmethoddispatch.ShapeDrawingProgram;

public class Main {
    public static void main(String[] args){
        Circle circle = new Circle();
        Square square = new Square();
        Triangle triangle = new Triangle();

        // We took an array of Shape (class) as we are storing different object types. (But they belong to the same super class, so it is possible)
        Shape[] shapes = {circle, square, triangle};
        for(Shape shape: shapes){
            shape.draw();
        }
    }
}
