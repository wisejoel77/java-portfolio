package com.wisejoel77.ExceptionHandling;

import java.util.Scanner;

// Nested Try-Catch
public class LibraryBookSearch {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of books: ");
        int size = Integer.parseInt(scanner.nextLine());
        String[] books = new String[size];
        for(int i=0; i<books.length; i++){
            System.out.print("Enter the name of book " + (i+1) + ": ");
            books[i] = scanner.nextLine();
        }
        try{
            System.out.print("Enter the index of the book you want to read: ");
            int index = scanner.nextInt();
            System.out.println("Enjoy reading " + books[index]);
            try{
                System.out.print("Enter a number to divide 100 with: ");
                int number = scanner.nextInt();
                System.out.println("Result: " + 100 / number);
            } catch (ArithmeticException e){
                System.out.println("Error: Cannot divide with zero");
            }
        } catch (IndexOutOfBoundsException e){
            System.out.println("Error: Invalid index");
        }
        System.out.println("Program finished");
        scanner.close();
    }
}
