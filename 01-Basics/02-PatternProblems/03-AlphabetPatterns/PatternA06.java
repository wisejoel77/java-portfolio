/*
Pattern:
    A
   ABA
  ABCBA
 ABCDCBA
ABCDEDCBA
*/

import java.util.Scanner;

public class PatternA06 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        for(int i=1; i<=rows; i++){
            char ch=64;
            for(int j=1; j<=(rows-i); j++){
                System.out.print(" ");
            }
            for(int j=1; j<=(2*i)-1; j++){
                int mid = (((2*i)-1)/2)+1;
                if(j<=mid){
                    ch++;
                    System.out.print(ch);
                } else{
                    ch--;
                    System.out.print(ch);
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}