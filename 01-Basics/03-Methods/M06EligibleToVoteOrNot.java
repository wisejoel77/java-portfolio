import java.util.Scanner;

public class M06EligibleToVoteOrNot {
    static boolean checkEligibility(int age){
        return age >= 18;
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        boolean isEligible = checkEligibility(age);
        if(isEligible){
            System.out.print("You are eligible to vote.");
        } else{
            System.out.print("You are not eligible to vote.");
        }
        scanner.close();
    }
}
