package com.wisejoel77.ExceptionHandling;

import java.util.Scanner;

// Showcasing finally
public class SecureLoginSimulator {

    static final String userName = "admin@wisejoel77.com";
    static final String password = "youwillneverknow";

    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);
        System.out.println("##### Welcome to login page #####");
        try{
            System.out.print("Enter your username: ");
            String user = scanner.next();
            System.out.print("Enter the password: ");
            String pass = scanner.next();
            if(password.equals(pass)){
                System.out.println("Login Successful. Session will terminate in 1 second.");
            } else {
                throw new IllegalArgumentException("Error: Login failed. Wrong password.");
            }
        } catch (IllegalArgumentException e){
            System.out.println(e.getMessage());
        } finally {
            scanner.close();
            System.out.println("Closing login session...");
            System.out.println("Program finished");
        }
    }
}
