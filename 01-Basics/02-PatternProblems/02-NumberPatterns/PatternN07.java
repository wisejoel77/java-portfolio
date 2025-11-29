/*
Pattern:
    1
   2 3
  3 4 5
 4 5 6 7
5 6 7 8 9
*/

import java.util.Scanner;

public class PatternN07 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=rows-i; j++){
                System.out.print(" ");
            }
            int n=i;
            for(int j=1; j<=i; j++){
                System.out.print(n + " ");
                n++;
            }
            System.out.println();
        }
        scanner.close();
    }
}