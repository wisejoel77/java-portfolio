/*
Pattern:
5 5 5 5 5 5 5 5 5
5 4 4 4 4 4 4 4 5
5 4 3 3 3 3 3 4 5
5 4 3 2 2 2 3 4 5
5 4 3 2 1 2 3 4 5
5 4 3 2 2 2 3 4 5
5 4 3 3 3 3 3 4 5
5 4 4 4 4 4 4 4 5
5 5 5 5 5 5 5 5 5
*/

import java.util.Scanner;

public class PatternN12 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        int size = (rows*2)-1;
        for(int i=1; i<=(2*rows)-1; i++){
            for(int j=1; j<=(2*rows)-1; j++){
                System.out.print(rows-(Math.min(Math.min((i-1),(j-1)),Math.min((size-i),(size-j)))));
            }
            System.out.println();
        }
        scanner.close();
    }
}