// WAP to print sum of first n natural numbers using for loop

import java.util.Scanner;

public class SumOfFirstNNaturalNumbersForLoop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the ending number: ");
        int n = scanner.nextInt();
        int sum=0,i;

        for(i=1;i<=n;i++){
            sum+=i;
        }
        System.out.print("The sum is: " +sum);
        scanner.close();
    }
}
