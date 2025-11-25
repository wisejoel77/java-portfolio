/*
Pattern: (Hollow Square)
* * * * *
*       *
*       *
*       *
* * * * *
*/

import java.util.Scanner;

public class Pattern11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.println();
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=rows; j++){
                if(i==1 || i==rows){
                    System.out.print("* ");
                } else {
                    if(j==1 || j==rows){
                        System.out.print("* ");
                    } else {
                        System.out.print("  ");
                    }
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}