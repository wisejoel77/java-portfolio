//Grading system using switch arrow labels.

import java.util.Scanner;

public class SwitchGradingSystemV2 {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your marks(0-100): ");
        int marks = scanner.nextInt();
        if (marks<0 || marks>100) {
            System.out.print("Enter valid marks(0-100) only.");
        } else {
            switch (marks / 10) {
                case 10, 9-> System.out.print("Grade: A");
                case 8-> System.out.print("Grade: B");
                case 7-> System.out.print("Grade: C");
                case 6-> System.out.print("Grade: D");
                case 5-> System.out.print("Grade: E");
                case 4,3,2,1,0-> System.out.print("Grade: F, You have failed.");
            }
        }
        scanner.close();
    }
}
