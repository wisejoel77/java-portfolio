/*
Pattern:
1
1 2
1 2 3
1 2 3 4
1 2 3 4 5
*/

import java.util.Scanner;

public class PatternN01 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=i; j++){
                System.out.print(j+" ");
            }
            System.out.println();
        }
        scanner.close();
    }
}
