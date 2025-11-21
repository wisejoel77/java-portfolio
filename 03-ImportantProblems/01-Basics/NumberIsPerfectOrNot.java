// Program to check if a number is perfect or not.

import java.util.Scanner;

public class NumberIsPerfectOrNot {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int sum=0;
        System.out.print("Enter the number: ");
        int n = scanner.nextInt();
        int i=n/2;
        while (i>=1) {
            if (n%i == 0){
                sum += i;
            }
            i--;
        }
        if (sum==n) {
            System.out.printf("%d is a perfect number",n);
        } else {
            System.out.printf("%d is not a perfect number",n);
        }
        scanner.close();
    }
}
