import java.util.Scanner;

public class M01MultiplicationTable {
    static void multiplicationTable(int n){
        for (int i=1; i<=10; i++){
            System.out.printf("%d x %d = %d\n",n,i,n*i);
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        multiplicationTable(number);
        System.out.print("Thank you!");
        scanner.close();
    }
}
