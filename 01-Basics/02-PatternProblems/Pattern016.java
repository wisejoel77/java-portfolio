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

public class Pattern016 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        int uL = (rows/2)+1;
        for(int i=1; i<=uL; i++){
            for(int j=1; j<=uL-i; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=i; j++){
                System.out.print("* ");
            }
            System.out.println();
        }
        int lL = rows-uL, a= lL;
        for(int i=1; i<=lL; i++){
            for(int j=1; j<=i; j++){
                System.out.print("  ");
            }
            for(int j=1; j<=a; j++){
                System.out.print("* ");
            }
            a--;
            System.out.println();
        }
        scanner.close();
    }
}
