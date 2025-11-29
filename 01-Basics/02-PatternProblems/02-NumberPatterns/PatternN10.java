/*
Pattern:
1
1 0
1 0 1
1 0 1 0
1 0 1 0 1
*/

import java.util.Scanner;

public class PatternN10 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=i; j++){
                if(j%2==0){
                    System.out.print("0");
                } else {
                    System.out.print("1");
                }
                if(j<i){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}