import java.util.Scanner;

public class ExtractingDomainName {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter you email address: ");
        String email = scanner.nextLine().trim();
        String[] parts = email.split("@");
        System.out.printf("The domain name is: %s",parts[1]);
        scanner.close();
    }
}
