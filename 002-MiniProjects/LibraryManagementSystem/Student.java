package com.wisejoel77.LibraryManagementSystem;

public class Student extends User{
    // Fields


    // Constructors
    public Student(String userId, String name){
        super(userId,name);
    }

    // Utility Methods
    //@Override
    public void borrow(LibraryItem item){
        if(item instanceof Book){
            super.borrow(item);
        } else {
            System.out.println(name + " cannot borrow a magazine.");
        }
    }
}
