/*
Pattern:
        *
      * * *
    * * * * *
  * * * * * * *
* * * * * * * * *
  * * * * * * *
    * * * * *
      * * *
        *
*/

import java.util.Scanner;

public class Pattern10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.println();
        int a = 0, uL = (rows/2)+1, b,c;
        for(int i=1; i<=uL; i++){
            for(int j=1; j<=uL-i; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=((i*2)-1); j++){
                System.out.print("* ");
            }
            System.out.println();
            a=i;
        }
        b=rows-a;
        c=b;
        for(int i=1; i<=b; i++){
            for(int j=1; j<=i; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=((c*2)-1); j++){
                System.out.print("* ");
            }
            c--;
            System.out.println();
        }
        scanner.close();
    }
}