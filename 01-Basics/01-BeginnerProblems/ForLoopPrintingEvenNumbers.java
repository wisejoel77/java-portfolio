// Program to print even numbers.

import java.util.Scanner;

public class ForLoopPrintingEvenNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the starting number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the ending number: ");
        int num2= scanner.nextInt();
        if(num1>=num2) {
            System.out.print("The starting number should be less than the ending number. Please enter a valid set.");
        } else {
            for(int i=num1;i<=num2;i++) {
                if (i%2==0) {
                    System.out.println(i);
                }
            }
        }
        scanner.close();
    }
}
