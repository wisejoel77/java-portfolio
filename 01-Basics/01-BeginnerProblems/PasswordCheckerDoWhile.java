import java.util.Scanner;

public class PasswordCheckerDoWhile {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        final String PASSWORD = "wisejoel77";
        boolean status = false;
        do {
            System.out.print("Enter your password: ");
            String checkPassword = scanner.next();
            if (PASSWORD.equals(checkPassword)) {
                System.out.print("Password is correct. Access has been granted.");
                status = true;
            } else {
                System.out.print("Password does not match. Try again.\n");
            }

        } while (!status);
        scanner.close();
    }
}
