// Program to check if given two numbers are equal or not, using bitwise or arithmetic operators.

import java.util.Scanner;

public class TwoNumbersAreEqualOrNotUsingBitwiseOperators {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();

        if ((num1 ^ num2) == 0) {
            System.out.printf("The numbers %d and %d are equal.", num1, num2);
        } else {
            System.out.printf("The numbers %d and %d are not equal.", num1, num2);
        }
    }
}
