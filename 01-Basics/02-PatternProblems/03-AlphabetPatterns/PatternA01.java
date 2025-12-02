/*
Pattern:
A
A B
A B C
A B C D
A B C D E
*/

import java.util.Scanner;

public class PatternA01 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        char ch = 'A';
        for(int i=1; i<=rows; i++){
            for(int j=1; j<=i; j++){
                System.out.print(ch);
                if(j<i){
                    System.out.print(" ");
                }
                ch++;
            }
            System.out.println();
            ch = 'A';
        }
        scanner.close();
    }
}
