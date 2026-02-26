// Program to find the number of divisors of a number.

import java.util.Scanner;

public class NumberOfDivisorsOfANumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scanner.nextInt(), count = 2;
        if (n==1) {
            System.out.print("The number of divisors is: 1");
        } else {
            int i = n / 2;
            while (i > 1) {
                if (n % i == 0)
                    count += 1;
                i--;
            }
            System.out.printf("The number of divisors is: %d", count);
        }
        scanner.close();
    }
}
