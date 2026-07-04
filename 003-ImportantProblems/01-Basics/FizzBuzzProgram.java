/*
FizzBuzzProgram
Print numbers from 1 to n. For multiples of 3, print “Fizz”, for multiples of 5, print “Buzz” and for multiples of both print “FizzBuzz”.
 */

import java.util.Scanner;

public class FizzBuzzProgram {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int n = scanner.nextInt();
        if (n<=0) {
            System.out.print("Enter positive numbers only.");
        } else {
            for(int i=1; i<=n;i++) {
                if (i%3==0 && i%5==0) {
                    System.out.println("FizzBuzz");
                } else if (i%5==0) {
                    System.out.println("Buzz");
                } else if (i%3==0) {
                    System.out.println("Fizz");
                } else {
                    System.out.println(i);
                }
            }
        }
        scanner.close();
    }
}
