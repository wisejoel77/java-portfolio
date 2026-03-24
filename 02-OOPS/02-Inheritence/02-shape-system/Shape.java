package com.wisejoel77.inheritence.shapeSystem;

public class Shape {
    // Fields
    protected String shapeName;

    // Constructors
    public Shape(String shapeName){
        setShapeName(shapeName);
    }

    // Setter Methods
    public void setShapeName(String shapeName){
        if(shapeName == null || shapeName.isBlank()){
            System.out.println("Shape name cannot be null or blank");
        } else {
            this.shapeName = shapeName;
        }
    }

    // Getter Methods
    public String getShapeName(){
        return shapeName;
    }

    // Utility Methods
    public void displayShapeDetails(){
        System.out.println("========== SHAPE DETAILS ==========");
        System.out.println("Shape: " + shapeName);
    }

    public double calculateArea(){
        return 0;
    }
}
