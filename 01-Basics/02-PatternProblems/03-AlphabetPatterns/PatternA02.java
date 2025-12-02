/*
Pattern:
A
B C
D E F
G H I J
K L M N O
*/

import java.util.Scanner;

public class PatternA02 {
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
        }
        scanner.close();
    }
}