package com.wisejoel77.ExceptionHandling;

import java.util.Scanner;

// Try with multiple catch blocks
public class StudentGradeViewer {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.print("Enter the number of students: ");
        int size = scanner.nextInt();
        int[] marks = new int[size];
        for(int i=0; i<marks.length; i++){
            System.out.print("Enter the marks of student " + (i+1) + ": ");
            marks[i] = scanner.nextInt();
        }
        try {
            System.out.print("Enter the student array index to view the marks: ");
            int index = scanner.nextInt();
            int mark = marks[index];
            System.out.print("Enter a divisor: ");
            int divisor = scanner.nextInt();
            int result = mark / divisor;
            System.out.println("Result: " + result);
        } catch(ArrayIndexOutOfBoundsException e){
            System.out.println("Error: Invalid index");
        } catch (ArithmeticException e){
            System.out.println("Error: Cannot divide with 0");
        }
        System.out.println("Program finished");
        scanner.close();
    }
}
