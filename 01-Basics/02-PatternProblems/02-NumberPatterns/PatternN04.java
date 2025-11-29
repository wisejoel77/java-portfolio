/*
Pattern:
        1
      2 1
    3 2 1
  4 3 2 1
5 4 3 2 1
*/

import java.util.Scanner;

public class PatternN04 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=rows-i; j++){
                System.out.print("  ");
            }
            for(int j=i; j>0; j--){
                System.out.print(j + " ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
