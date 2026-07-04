// WAP to count digits in a number.

import java.util.Scanner;

public class CountDigitsInANumber {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int originalNumber = scanner.nextInt();
        int number = originalNumber,count=0;
        if (number==0){
            System.out.printf("The no.of digits in %d are: 1",originalNumber);
        } else {
            while (number != 0) {
                count += 1;
                number = number / 10;
            }
            System.out.printf("The no.of digits in %d are: %d", originalNumber, count);
        }
        scanner.close();
    }
}
