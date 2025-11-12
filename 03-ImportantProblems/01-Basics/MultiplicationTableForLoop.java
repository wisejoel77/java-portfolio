// WAP to print multiplication table of a number.

import java.util.Scanner;

public class MultiplicationTableForLoop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number you want the multiplication table for: ");
        int n = scanner.nextInt();
        System.out.print("Enter the range of multiples you want: ");
        int range = scanner.nextInt();
        int i=1;
        System.out.printf("\nMultiplication table of %d up to %d multiples:%n",n,range);
        for(;i<=range;) {
            System.out.printf("%d x %d = %d\n",n,i,n*i);
            i++;
        }
        scanner.close();
    }
}
