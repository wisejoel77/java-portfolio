// WAP to find sum of digits of a number.

import java.util.Scanner;

public class SumOfDigitsOfANumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int originalNumber = scanner.nextInt();
        int number = originalNumber;
        int sum=0;
        while (number!=0) {
            int digit=number%10;
            sum = sum+digit;
            number = number/10;
        }
        System.out.printf("The sum of digits of %d is: %d",originalNumber,sum);
        scanner.close();
    }
}
