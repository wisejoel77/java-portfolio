// WAP to reverse a given number.

import java.util.Scanner;

public class ReverseANumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scanner.nextInt();
        int reversed=0;
        while (n!=0) {
            int d = n%10;
            reversed = reversed * 10 + d;
            n = n/10;
        }
        System.out.printf("The reversed number is: %d",reversed);
        scanner.close();
    }
}
