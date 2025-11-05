// Program to calculate the total bill for a pizza order based on size and extra toppings.


import java.util.Scanner;

public class PizzaOrderingSystem {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("++++++++++Welcome to Wise Pizza Shop++++++++++");
        int s = 100, m = 200, l = 300, smallPepperoni = 20, pepperoni = 50, cheese = 20, total = 0;
        System.out.println("\n---Today's Menu--- \n1.Pizza (Small) \n2.Pizza (Medium) \n3.Pizza (Large)");
        System.out.print("What pizza would you like to order(S,M or L)?: ");
        char size = Character.toUpperCase(scanner.next().charAt(0));
        if (size == 'S' || size == 'M' || size == 'L') {
            if (size == 'S') {
                total += s;
            } else if (size == 'M') {
                total += m;
            } else {
                total += l;
            }
            System.out.print("Do you want to add pepperoni(Y/N)?: ");
            char pepperoniChoice = Character.toUpperCase(scanner.next().charAt(0));
            if (pepperoniChoice == 'Y' || pepperoniChoice == 'N') {
                if (pepperoniChoice == 'Y' && size == 'S') {
                    total += smallPepperoni;
                } else if (pepperoniChoice == 'Y') {
                    total += pepperoni;
                }
            }
            else {
                System.out.print("Invalid entry. Must enter \"Y\" for Yes and \"N\" for No.");
            }
            System.out.print("Do you want to add extra cheese(Y/N)?: ");
            char cheeseChoice = Character.toUpperCase(scanner.next().charAt(0));
            if (cheeseChoice == 'Y' || cheeseChoice == 'N') {
                if (cheeseChoice == 'Y') {
                    total += cheese;
                }
                System.out.printf("Thank you for ordering from us. %nYour bill is Rs.%d.", total);
            } else {
                System.out.print("Invalid entry. Must enter \"Y\" for Yes and \"N\" for No.");
            }
        }
        else{
            System.out.print("Invalid entry. Only enter \"S\" for small, \"M\" for medium and \"L\" for large.");
        }
        scanner.close();
    }
}