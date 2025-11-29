/*
Pattern:
1
2 3
4 5 6
7 8 9 10
11 12 13 14 15
*/

import java.util.Scanner;

public class PatternN11 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        int n=1;
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=i; j++){
                System.out.print(n);
                n++;
                if(j<i){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}