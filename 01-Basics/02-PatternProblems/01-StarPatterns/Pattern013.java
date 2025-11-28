/*
Pattern:
*
* *
*   *
*     *
* * * * *
*/

import java.util.Scanner;

public class Pattern013 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        int uL = rows-1;
        for(int i=1; i<=uL; i++){
            for(int j=1; j<=uL; j++){
                if(i==j || j==1){
                    System.out.print("* ");
                } else{
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        for(int i=1; i<=rows; i++){
            System.out.print("* ");
        }
        scanner.close();
    }
}
