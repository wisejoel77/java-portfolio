import java.util.Scanner;

public class M02PrimeOrNot {
    static void primeCheck(int n){
        if(n<=1){
            System.out.printf("%d is not a prime number.",n);
        } else{
            int max=(int)Math.sqrt(n);
            boolean isPrime = true;
            for(int i=2; i<=max; i++){
                if(n%i==0){
                    isPrime=false;
                    break;
                }
            }
            if(isPrime){
                System.out.printf("%d is a prime number.",n);
            } else{
                System.out.printf("%d is not a prime number.",n);
            }
        }
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number: ");
        int number = scanner.nextInt();
        primeCheck(number);
        scanner.close();
    }
}
