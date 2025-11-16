// WAP to check if a number is palindrome.

import java.util.Scanner;

public class NumberIsPalindromeOrNot {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int originalNumber = scanner.nextInt();
        int n=originalNumber,reversedNumber=0;
        while (n!=0) {
            int d=n%10;
            reversedNumber=(reversedNumber*10)+d;
            n=n/10;
        }
        if (originalNumber==reversedNumber) {
            System.out.printf("%d is a palindrome.",originalNumber);
        } else {
            System.out.printf("%d is not a palindrome.",originalNumber);
        }
        scanner.close();
    }
}
