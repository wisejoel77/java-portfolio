// Program to calculate sum of numbers.

import java.util.Scanner;

public class ForLoopSumOfNumbers {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int sum=0;
        System.out.print("Enter the starting number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the ending number: ");
        int num2 = scanner.nextInt();
        for(int i=num1;i<=num2;i++) {
            sum+=i;
        }
        System.out.printf("The sum of numbers starting from %d to %d is %d",num1,num2,sum);
        scanner.close();
    }
}
