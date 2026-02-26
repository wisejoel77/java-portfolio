// Program to find the GCD of two numbers.
// Hint: Euclidean Algorithm.

import java.util.Scanner;

public class GCDOfTwoNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        int r=1;
        while(r!=0) {
            r = num1%num2;
            num1 = num2;
            num2 = r;
        }
        System.out.print("The GCD is: " +num1);
        scanner.close();
    }
}
