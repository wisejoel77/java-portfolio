package com.wisejoel77.encapsulation.student;

public class Main {
    public static void main(String[] args){
        // Valid entry example
        Student s1 = new Student("Arnold Joel Joshua Matangi", "23ME1A0546", 10, "marnoldjoeljoshua@gmail.com");
        s1.displayStudentDetails();

        // Invalid entry examples
        Student s2 = new Student("", "23ME1A05ZZ", 9.5, "example@gmail.com");
        Student s3 = new Student("Example name", "23ME1A05ZZ", 11, "example@gmail.com");
        Student s4 = new Student("Example name", "23ME1A05ZZ", 9, "example.com");
    }
}
