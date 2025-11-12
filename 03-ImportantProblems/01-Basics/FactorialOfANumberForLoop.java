// WAP to print factorial of a number using for loop.

import java.util.Scanner;

public class FactorialOfANumberForLoop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scanner.nextInt();
        int i=2,factorial=1;
        if (n<0){
            System.out.print("Cannot find factorial for a negative number.");
        } else {
            if(n==0 || n==1) {
                System.out.printf("The factorial of %d is: %d",n,factorial);
            } else {
                for (; i <= n; i++) {
                    factorial*=i;
                }
                System.out.printf("The factorial of %d is: %d",n,factorial);
            }
        }
        scanner.close();
    }
}
