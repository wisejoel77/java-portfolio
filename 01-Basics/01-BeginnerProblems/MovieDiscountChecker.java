// Checking if a person is eligible for a discount on a movie ticket. The discount is applicable if the person is under 18 years or over 60 years old.

import java.util.Scanner;

public class MovieDiscountChecker {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int age;
        System.out.print("Enter your age: ");
        age = scanner.nextInt();

        if(age<18 || age>60){
            System.out.print("You are eligible to get a discount for the movie ticket.");
        }
        else{
            System.out.print("Unfortunately, You are not eligible for the discount.");
        }
    }
}
