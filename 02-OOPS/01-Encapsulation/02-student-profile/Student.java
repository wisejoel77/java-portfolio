package com.wisejoel77.encapsulation.student;

public class Student {
    // Fields
    private String name;
    private final String rollNumber;
    private double gpa;
    private String email;

    // Constructors
    public Student(String name, String rollNumber, double gpa, String email){
        setName(name);
        this.rollNumber = rollNumber;
        setGpa(gpa);
        setEmail(email);
    }

    public Student(String name, String rollNumber){
        this(name, rollNumber, 0.0, "not entered");
    }

    // Getter methods
    public String getName(){
        return name;
    }

    public String getRollNumber(){
        return rollNumber;
    }

    public double getGpa(){
        return gpa;
    }

    public String getEmail(){
        return email;
    }

    // Setter Methods
    public void setName(String name){
        if(name != null && !name.isBlank()){
            this.name = name;
        } else{
            System.out.println("Name cannot be null or empty.");
        }
    }

    public void setGpa(double gpa){
        if(gpa >= 0 && gpa <= 10){
            this.gpa = gpa;
        } else {
            System.out.println("GPA must be between 0 and 10.");
        }
    }

    public void setEmail(String email){
        if(email == null){
            System.out.println("Email cannot be null.");
            return;
        }
        if(email.equals("not entered")){
            this.email = email;
        } else {
            if (email.contains("@")) {
                this.email = email;
            } else {
                System.out.println("Invalid email.");
            }
        }
    }

    // Utility Methods
    public boolean isTopper() {
        return gpa > 9;
    }

    public void displayStudentDetails(){
        System.out.println("=============== STUDENT DETAILS ===============");
        System.out.println("Name: " + getName());
        System.out.println("Roll Number: " + getRollNumber());
        System.out.println("GPA: " + getGpa());
        System.out.println("Email: " + getEmail());
        if(isTopper()){
            System.out.println("Status: Topper");
        } else{
            System.out.println("Status: Not a topper");
        }
        System.out.println();
    }
}
