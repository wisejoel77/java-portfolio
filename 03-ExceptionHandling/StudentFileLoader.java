package com.wisejoel77.ExceptionHandling;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.util.Scanner;

// Checked and Unchecked Exceptions
public class StudentFileLoader {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        // Checked Exception
        System.out.print("Enter the name of the file to download: ");
        String fileName = scanner.nextLine();
        FileReader file;
        try {
            file = new FileReader(fileName); // Not doing much here, as I didn't learn file handling yet as of 23 July 2026. (This program won't be updated in the future as well, check the next concepts)
        } catch (FileNotFoundException e){
            System.out.println("Error: " + "\"" + fileName + "\"" + " does not exist in our database. Unable to download");
        }

        // Unchecked Exception
        try{
            System.out.print("Enter a number to divide 100: ");
            int number = scanner.nextInt();
            System.out.println("Result: " + 100 / number);
        } catch (ArithmeticException e){
            System.out.println("Error: Cannot divide with zero");
        }
        System.out.println("Program finished");
        scanner.close();
    }
}
