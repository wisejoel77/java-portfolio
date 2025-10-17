import java.util.Scanner;

public class SimpleInterest {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the principal amount: ");
        double principalAmount = scanner.nextDouble();
        System.out.print("Enter the rate of interest (in %): ");
        double rateOfInterest = scanner.nextDouble();
        System.out.print("Enter the duration of the interest (in years): ");
        double interest = scanner.nextDouble();
        double simpleInterest = (principalAmount * rateOfInterest * interest) / 100;
        System.out.printf("The Simple Interest is: %.5f", simpleInterest);
    }
}
