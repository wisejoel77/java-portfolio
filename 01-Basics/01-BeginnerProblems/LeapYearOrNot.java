// Program to find if a year is leap year or not.

import java.util.Scanner;

public class LeapYearOrNot {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the year: ");
        int year = scanner.nextInt();

        if(year % 400 == 0 || (year % 4 == 0 && year % 100 != 0) ){
            System.out.printf("The year %d is a leap year.",year);
        }
        else{
            System.out.printf("The year %d is not a leap year.",year);
        }
    }
}
