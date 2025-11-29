/*
Pattern:
1                 1
1 2             2 1
1 2 3         3 2 1
1 2 3 4     4 3 2 1
1 2 3 4 5 5 4 3 2 1
*/

import java.util.Scanner;

public class PatternN05 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        int space = (rows*2)-2;
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j + " ");
            }
            for(int j=1; j<=space; j++){
                System.out.print("  ");
            }
            for(int j=i; j>=1; j--){
                System.out.print(j + " ");
            }
            System.out.println();
            space -= 2;
        }
        scanner.close();
    }
}