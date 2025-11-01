// Check if a person is eligible to vote or not. Conditions: Age should be 18 or over and must be a citizen of the country.

import java.util.Scanner;

public class VoteEligibilityChecker {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int age;
        boolean isCitizen;
        System.out.print("Please enter your age: ");
        age = scanner.nextInt();
        System.out.print("Are you a citizen of this country(true or false)?: ");
        isCitizen = scanner.nextBoolean();

        if(isCitizen && age>=18){
            System.out.print("You are eligible to vote.");
        }
        else{
            System.out.print("You are not eligible to vote.");
        }
    }
}
