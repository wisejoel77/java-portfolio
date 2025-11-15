import java.util.Scanner;

public class RangeCheckingWhileLoop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        while(true) {
            System.out.print("Enter a number within the range(1-50): ");
            int n = scanner.nextInt();
            if (n>=1 && n<=50) {
                System.out.printf("%d is a valid input.\n",n);
            } else {
                System.out.printf("%d is an invalid input. Program Terminated.",n);
                break;
            }
        }
        scanner.close();
    }
}
