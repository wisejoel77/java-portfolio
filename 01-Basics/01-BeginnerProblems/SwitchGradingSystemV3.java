//Grading system using switch arrow labels and expression.

import java.util.Scanner;

public class SwitchGradingSystemV3 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your marks(0-100): ");
        int marks = scanner.nextInt();
        String answer=null;
        if (marks<0 || marks>100) {
            System.out.print("Enter valid marks(0-100) only.");
        } else {
                answer = switch (String.valueOf(marks / 10)) {
                case "10", "9"-> "Grade: A";
                case "8"-> "Grade: B";
                case "7"-> "Grade: C";
                case "6"-> "Grade: D";
                case "5"-> "Grade: E";
                case "4","3","2","1","0"-> "Grade: F, You have failed.";
                default-> "Invalid Grade.";
            };
        }
        System.out.print("Your Grade is: " + answer);
        scanner.close();
    }
}
