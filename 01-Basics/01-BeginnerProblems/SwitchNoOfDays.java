// Program to print the number of days in a month. ( Does not work for leap years in february. )

import java.util.Scanner;

public class SwitchNoOfDays {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        String answer = null;
        System.out.print("Enter your month: ");
        int month = scanner.nextInt();
        if (month <= 12 && month >= 1) {
            answer = switch (String.valueOf(month)) {
                case "1", "3", "5", "7", "8", "10", "12" -> "31";
                case "4", "6", "9", "11" -> "30";
                case "2" -> "28";
                default -> "Enter a valid month.";
            };
            System.out.print("Your month contains " + answer + " days.");
        } else {
            System.out.print("Please enter a valid number(1-12).");
        }
        scanner.close();
    }
}
