package com.wisejoel77.FileIO.EmployeeProfileReader;

import java.io.FileReader;
import java.io.IOException;

public class EmployeeProfileReader {
    public static void main(String[] args){
        try (FileReader fileReader = new FileReader("src\\com\\wisejoel77\\FileIO\\EmployeeProfileReader\\file.txt")) {
            System.out.println("Displaying the details: ");
            int data;
            while((data = fileReader.read()) != -1){
                System.out.print((char) data);
            }
            System.out.println("\n");
            System.out.println("Details printed successfully");
        } catch (IOException e){
            System.out.println(e.getMessage());
        } finally {
            System.out.println("Program finished");
        }
    }
}
