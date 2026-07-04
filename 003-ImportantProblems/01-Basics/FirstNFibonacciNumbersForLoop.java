// WAP to print first n Fibonacci numbers.

import java.util.Scanner;

public class FirstNFibonacciNumbersForLoop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("How many Fibonacci numbers do you want to print?: ");
        int range = scanner.nextInt();
        int a=0,b=1;
        if (range <=0) {
            System.out.print("Enter valid range.");
        } else {
            if ( range==1){
                System.out.print("The first number of Fibonacci series is: ");
                System.out.print(a);
            } else if (range==2) {
                System.out.print("The first two numbers of Fibonacci series is: ");
                System.out.printf("%d,%d",a,b);
            } else {
                System.out.printf("The first %d numbers of Fibonacci series is: ",range);
                System.out.printf("%d,%d",a,b);
                for(int i=3; i<=range;i++) {
                    int c=a+b;
                    a=b;
                    b=c;
                    System.out.printf(",%d",c);
                }
            }
        }
        scanner.close();
    }
}
