/*
Pattern:
A B C D E
A B C D
A B C
A B
A
*/

import java.util.Scanner;

public class PatternA04 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        char ch = 'A';
        for(int i=rows; i>=1; i--){
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