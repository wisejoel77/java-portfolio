/*
Pattern:
*
* *
* * *
* * * *
* * *
* *
*
*/

import java.util.Scanner;

public class Pattern007 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        int a = 0;
        for(int i=1; i<=((rows/2)+1); i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
            a = i;
        }
        for(int i=a+1; i<=rows; i++){
            for(int j=1; j<=((rows-i)+1); j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        scanner.close();
    }
}

