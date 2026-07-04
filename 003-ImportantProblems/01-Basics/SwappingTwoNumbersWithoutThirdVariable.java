// Program to swap two numbers without using a third variable.

import java.util.Scanner;

public class SwappingTwoNumbersWithoutThirdVariable {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter num1: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter num2: ");
        int num2 = scanner.nextInt();
        System.out.printf("Before Swapping: num1 = %d and num2 = %d", num1, num2);

        num1=num1+num2;
        num2=num1-num2;
        num1=num1-num2;

        System.out.printf("%nAfter Swapping: num1 = %d and num2 = %d", num1, num2);
    }
}
