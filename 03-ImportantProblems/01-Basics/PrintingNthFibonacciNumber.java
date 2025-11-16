// WAP to find Nth Fibonacci number

import java.util.Scanner;

public class PrintingNthFibonacciNumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the term you want in Fibonacci Series: ");
        int n = scanner.nextInt();
        int a=0,b=1,c=0;
        if (n<=0) {
            System.out.print("Enter a valid range.");
        } else {
            if (n==1) {
                System.out.printf("The Fibonacci number at position %d is: 0",n);
            } else if (n==2) {
                System.out.printf("The Fibonacci number at position %d is: 1",n);
            } else {
                for (int i=3;i<=n;i++) {
                    c=a+b;
                    a=b;
                    b=c;
                }
                System.out.printf("The Fibonacci number at position %d is: %d",n,c);
            }
        }
        scanner.close();
    }
}
