// Program to find the LCM of two numbers.
// LCM = (a*b) / GCD(a,b)

import java.util.Scanner;

public class LCMOfTwoNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        int r=1, numerator = num1*num2;
        while(r!=0) {
            r = num1%num2;
            num1 = num2;
            num2 = r;
        }
        int GCD = num1;
        int LCM = numerator / GCD;
        System.out.print("The LCM is: " + LCM);
        scanner.close();
    }
}
