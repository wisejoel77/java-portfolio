// WAP to calculate power of a number using for loop.

import java.util.Scanner;

public class PowerOfANumberForLoop {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int n = scanner.nextInt();
        System.out.print("Enter the power: ");
        int p = scanner.nextInt();
        int answer=1;
        if(p<0) {
            System.out.print("The power cannot be a negative number.");
        } else if (n==0 && p==0) {
            System.out.print("Zero power zero is undefined.");
        } else if (p==0) {
            System.out.printf("%d^%d = %d",n,p,answer);
        } else {
            for (int i=1;i<=p;i++){
                answer = answer*n;
            }
            System.out.printf("%d ^ %d = %d",n,p,answer);
        }
        scanner.close();
    }
}
