// Check if a person is allowed to enter a concert or not. A person is allowed only if they are 18 or older and either have a ticket or are invited by a VIP.

import java.util.Scanner;

public class ConcertEntryChecker {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter your age: ");
        int age = scanner.nextInt();
        System.out.print("Do you have a ticket (true or false)?: ");
        boolean haveTicket = scanner.nextBoolean();
        System.out.print("Are you invited by a VIP (true or false)?: ");
        boolean invitedByVIP = scanner.nextBoolean();

        if ( age >= 18 && (haveTicket || invitedByVIP) ) {
            System.out.print("You are allowed to enter the concert.");
        }
        else {
            System.out.print("Unfortunately, You did not meet the requirements to enter the concert.");
        }
    }
}
