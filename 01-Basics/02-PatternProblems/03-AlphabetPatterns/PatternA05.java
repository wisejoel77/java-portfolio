/*
Pattern:
    A
   A B
  A B C
 A B C D
A B C D E
*/

import java.util.Scanner;

public class PatternA05 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        for(int i=1; i<=rows; i++){
            char ch = 'A';
            for(int j=1; j<=(rows-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=i; j++){
                System.out.print(ch);
                if(j<i){
                    System.out.print(" ");
                }
                ch++;
            }
            System.out.println();
        }
        scanner.close();
    }
}