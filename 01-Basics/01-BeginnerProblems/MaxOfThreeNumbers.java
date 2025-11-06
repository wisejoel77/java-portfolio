// WAP to find maximum of three numbers without using ternary operator. (use if else)

import java.util.Scanner;

public class MaxOfThreeNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.print("Enter the third number: ");
        int num3 = scanner.nextInt();

        if (num1>=num2 && num1>=num3) {
            System.out.printf("The maximum number is: %d",num1);
        } else if (num2>=num1 && num2>=num3) {
            System.out.printf("The maximum number is: %d",num2);
        } else {
            System.out.printf("The maximum number is: %d",num3);
        }
    }
}
