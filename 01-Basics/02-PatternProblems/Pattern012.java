/*
Pattern:(Hollow Rectangle)
* * * * * * *
*           *
*           *
*           *
* * * * * * *
*/

import java.util.Scanner;

public class Pattern012 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();
        System.out.println();
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=cols; j++){
                if(i==1 || i==rows || j==1 || j==cols){
                    System.out.print("* ");
                } else {
                    System.out.print("  ");
                }
            }
            System.out.println();
        }
        scanner.close();
    }

}
