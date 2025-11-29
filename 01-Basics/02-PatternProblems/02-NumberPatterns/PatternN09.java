/*
Pattern:
      7
     6 7
    5 6 7
   4 5 6 7
  3 4 5 6 7
 2 3 4 5 6 7
1 2 3 4 5 6 7
*/

import java.util.Scanner;

public class PatternN09 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=(rows-i); j++){
                System.out.print(" ");
            }
            for(int j=(rows-i)+1; j<=rows; j++){
                System.out.print(j);
                if(j<rows){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}