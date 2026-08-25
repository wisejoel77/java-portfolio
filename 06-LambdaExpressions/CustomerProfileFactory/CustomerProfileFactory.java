package com.wisejoel77.LambdaExpressions.CustomerProfileFactory;

import java.util.ArrayList;
import java.util.Scanner;

public class CustomerProfileFactory {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        CustomerCreator customerCreator = Customer :: new;
        ArrayList<Customer> customers = new ArrayList<>();
        System.out.println("======= Customer Profile Factory =======");
        System.out.println("Enter \"none\" to stop");
        String name;

        while(true){
            System.out.print("Enter the customer name: ");
            name = scanner.nextLine();
            if(name.equals("none")){
                break;
            }
            customers.add(customerCreator.createCustomer(name));
        }

        System.out.println("\n##### Printing Customers Details #####");
        for(Customer customer: customers){
            customer.display();
            System.out.println();
        }
        scanner.close();
    }
}
