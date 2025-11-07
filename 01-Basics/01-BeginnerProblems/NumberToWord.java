/* Write a Java program that takes an integer between 1 and 9 as input and prints
the corresponding word (e.g., 1 -> "One", 2 -> "Two", ..., 9 -> "Nine") using a switch statement. */

import java.util.Scanner;

public class NumberToWord {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number(1-9): ");
        int number = scanner.nextInt();
        String word;
        if (number>0 && number<10) {
            word = switch(number) {
                case 1-> "One.";
                case 2-> "Two.";
                case 3-> "Three.";
                case 4-> "Four.";
                case 5-> "Five.";
                case 6-> "Six.";
                case 7-> "Seven.";
                case 8-> "Eight.";
                case 9-> "Nine.";
                default-> "Invalid.";
            };
            System.out.printf("%d = %s",number,word);
        } else {
            System.out.print("Invalid Input, Please enter a number between 1-9 only.");
        }
        scanner.close();
    }
}
