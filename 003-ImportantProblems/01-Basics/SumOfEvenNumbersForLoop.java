// WAP to print sum of even numbers between 1 and N.

import java.util.Scanner;

public class SumOfEvenNumbersForLoop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the range: ");
        int range = scanner.nextInt();
        int sum=0;
        if (range<0) {
            System.out.print("Enter a number greater than 0.");
        } else {
            for (int i = 1; i <= range; i++) {
                if (i%2==0)
                    sum+=i;
            }
            System.out.printf("The sum of even numbers between 1 and %d is: %d",range,sum);
        }
        scanner.close();
    }
}
