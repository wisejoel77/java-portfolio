// WAP to print numbers in reverse. (E.g from 10 to 1)

import java.util.Scanner;

public class PrintingNumbersInReverseForLoop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the starting number to print in reverse: ");
        int start = scanner.nextInt();
        System.out.print("Enter the range: ");
        int end = scanner.nextInt();
        if (end>start) {
            System.out.print("The range should be less than the starting number.");
        } else {
            System.out.printf("Printing numbers from %d to %d: \n",start,end);
            for (int i=start; i>=end;i--) {
                System.out.println(i);
            }
        }
        scanner.close();
    }
}
