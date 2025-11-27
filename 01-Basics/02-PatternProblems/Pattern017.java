/*
Pattern:
*             *
* *         * *
* * *     * * *
* * * * * * * *
* * *     * * *
* *         * *
*             *
*/

import java.util.Scanner;

public class Pattern017 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        int uL = (rows/2)+1, s=(uL*2)-2;
        for(int i=1; i<=uL; i++){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            for(int j=1; j<=s; j++){
                System.out.print("  ");
            }
            s -= 2;
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        int lL = rows - uL;
        s = 2;
        for (int i=lL; i>=1;i--){
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            for(int j=1; j<=s; j++){
                System.out.print("  ");
            }
            s += 2;
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
