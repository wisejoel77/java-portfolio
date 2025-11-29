/*
Pattern:
5 5 5 5 5
 4 4 4 4
  3 3 3
   2 2
    1
*/

import java.util.Scanner;

public class PatternN08 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        for(int i=rows; i>=1; i--){
            for(int j=1; j<=(rows-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(i);
                if(j<i){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}