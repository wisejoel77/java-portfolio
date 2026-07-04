// WAP to check if a number is prime or not.

import java.util.Scanner;

public class PrimeNumberOrNotForLoop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = scanner.nextInt();
        int flag = 0;
        if (n<=1) {
            System.out.printf("%d is not a prime number.",n);
        } else {
            for (int i=2; i<=Math.sqrt(n);i++) {
                if (n%i==0) {
                    flag +=1;
                    break;
                }
            }
            if (flag==0) {
                System.out.printf("%d is a prime number.",n);
            } else {
                System.out.printf("%d is not a prime number.",n);
            }
        }
        scanner.close();
    }
}
