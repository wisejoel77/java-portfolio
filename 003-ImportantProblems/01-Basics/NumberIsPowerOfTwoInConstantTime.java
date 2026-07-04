// Program to check if a number is a power of 2, In constant time. ( Using bitwise operators. )

import java.util.Scanner;

public class NumberIsPowerOfTwoInConstantTime {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();

        if ( number>0 && (number & (number-1)) == 0 ) {
            System.out.printf("The number %d is a power of 2", number);
        } else {
            System.out.printf("The number %d is not a power of 2", number);
        }
    }
}
