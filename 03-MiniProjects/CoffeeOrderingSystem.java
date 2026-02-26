// Coffee Ordering System

import java.util.Scanner;

public class CoffeeOrderingSystem {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int espresso = 200, cappuccino = 250, latte = 300, bill=0;
        int whippedCream=30, vanilla=20, hazelNut=25;
        System.out.println("******************************");
        System.out.println("\uD83D\uDE42 Welcome to Coffee Cafe! \u2615");
        System.out.println("******************************");
        System.out.println("Choose your coffee: ");
        System.out.println("1.Espresso – ₹200");
        System.out.println("2.Cappuccino – ₹250");
        System.out.println("3.Latte – ₹300");
        System.out.print("Enter your choice: ");
        int choice = scanner.nextInt();
        if (choice==1 || choice==2 || choice==3) {
            if (choice==1) {
                bill += espresso;
            } else if (choice==2) {
                bill+= cappuccino;
            } else {
                bill +=latte;
            }
            System.out.print("Do you want to add Whipped Cream for ₹30(yes/no)?: ");
            char check = Character.toUpperCase(scanner.next().charAt(0));
            if (check=='Y') {
                bill += whippedCream;
            }
            System.out.print("Do you want to add a flavour shot(yes/no)?: ");
            check = Character.toUpperCase(scanner.next().charAt(0));
            if (check=='Y') {
                System.out.print("Choose what you want to add, Vanilla for ₹20 and Hazelnut for ₹25. (v/h): ");
                check = Character.toUpperCase(scanner.next().charAt(0));
                if (check=='V') {
                    bill += vanilla;
                } else if (check=='H') {
                    bill +=hazelNut;
                }
            }
            System.out.print("Total bill is: ₹" +bill);
        } else {
            System.out.print("Invalid entry, Please enter a valid choice.");
        }
        scanner.close();
    }
}
