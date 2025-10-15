import java.util.Scanner;

public class InchesToFoot{
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your height in inches: ");
        double inches = scanner.nextDouble();
        double foot = inches/12;
        System.out.printf("Your height in foot is: %.2f",foot);

    }
}
