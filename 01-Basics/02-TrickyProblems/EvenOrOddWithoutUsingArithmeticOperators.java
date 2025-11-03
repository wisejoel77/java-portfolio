// Program to find out if a number is ever or odd without using arithmetic operators.

import java.util.Scanner;

public class EvenOrOddWithoutUsingArithmeticOperators {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        if ((number&1)==0) {
            System.out.printf("The number %d is even.",number);
        } else {
            System.out.printf("The number %d is odd.",number);
        }
    }
}
