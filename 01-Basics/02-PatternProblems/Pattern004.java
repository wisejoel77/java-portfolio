/*
Pattern:
        *
      * *
    * * *
  * * * *
* * * * *
*/

import java.util.Scanner;

public class Pattern4 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.println();
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=(rows-i); j++) {
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
