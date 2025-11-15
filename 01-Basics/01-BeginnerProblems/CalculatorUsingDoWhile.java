import java.util.Scanner;

public class CalculatorUsingDoWhile {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        int c;
        do {
            System.out.println("*****************************");
            System.out.println("Welcome to my Calculator!! \uD83E\uDDEE");
            System.out.println("*****************************\n");

            System.out.println("Operations \uD83D\uDC47");
            System.out.println("1 -> Addition \n2 -> Subtraction \n3 -> Multiplication \n4 -> Division \n5 -> Modulo \n6 -> Exit");
            System.out.print("Enter your choice: ");
            c = scanner.nextInt();
            int num1,num2;

            Integer result = switch(c) {
                case 1 -> {
                    System.out.print("Enter num1: ");
                    num1 = scanner.nextInt();
                    System.out.print("Enter num2: ");
                    num2 = scanner.nextInt();
                    yield num1+num2;
                }
                case 2 -> {
                    System.out.print("Enter num1: ");
                    num1 = scanner.nextInt();
                    System.out.print("Enter num2: ");
                    num2 = scanner.nextInt();
                    yield num1-num2;
                }
                case 3 -> {
                    System.out.print("Enter num1: ");
                    num1 = scanner.nextInt();
                    System.out.print("Enter num2: ");
                    num2 = scanner.nextInt();
                    yield num1*num2;
                }
                case 4 -> {
                    System.out.print("Enter num1: ");
                    num1 = scanner.nextInt();
                    System.out.print("Enter num2: ");
                    num2 = scanner.nextInt();
                    if (num2==0) {
                        System.out.print("num2 cannot be zero.\n\n");
                        yield null;
                    } else {
                        yield num1/num2;
                    }
                }
                case 5 -> {
                    System.out.print("Enter num1: ");
                    num1 = scanner.nextInt();
                    System.out.print("Enter num2: ");
                    num2 = scanner.nextInt();
                    if (num2==0) {
                        System.out.print("num2 cannot be zero.\n\n");
                        yield null;
                    } else {
                        yield num1%num2;
                    }
                }
                default -> null;
            };
            if (result!=null) {
                System.out.printf("Result = %d\n\n",result);
            }
        }while(c>=1 && c<=5);
        System.out.print("Thank you for using my Calculator.");
        scanner.close();
    }
}
