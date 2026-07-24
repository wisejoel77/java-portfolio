package com.wisejoel77.FileIO.EmployeeDocumentReader;

import java.io.FileInputStream;
import java.io.IOException;

public class EmployeeDocumentReader {
    public static void main(String[] args){
        System.out.println("### Welcome to Wise Organization ###\n");
        try (FileInputStream fileInputStream = new FileInputStream("src\\com\\wisejoel77\\FileIO\\EmployeeDocumentReader\\file.txt")) {
            System.out.println("Printing Employee Details: ");
            int data;
            while((data = fileInputStream.read()) != -1){
                System.out.print((char)data);
            }
            System.out.println();
        } catch (IOException e){
            System.out.println("Error: " + e.getMessage());
        } finally {
            System.out.println("\nProgram finished");
        }
    }
}
