/*
Pattern:
* * * * *
* * * *
* * *
* *
*
*/

import java.util.Scanner;

public class Pattern005 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.println();
        for(int i=rows; i>=1; i--) {
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        scanner.close();
    }
}

