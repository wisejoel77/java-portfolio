import java.util.Scanner;

public class MaxAmongThreeNumbersUsingTernaryOperator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int a,b,c;
        System.out.print("Enter the first number: ");
        a = scanner.nextInt();
        System.out.print("Enter the second number: ");
        b = scanner.nextInt();
        System.out.print("Enter the third number: ");
        c= scanner.nextInt();

        int max = (a>b)? (a>c? a:c) : (b>c? b:c);
        System.out.printf("The maximum number among %d, %d, %d is: %d",a,b,c,max);
    }
}
