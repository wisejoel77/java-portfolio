import java.util.Scanner;

public class M05PriceCalculation {
    static double calculatePrice(int quantity, double price, boolean isMember){
        if(isMember){
            return (quantity*price)*0.85;
        } else{
            return quantity*price;
        }
    }

    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the price of the product: ");
        double price = scanner.nextDouble();
        System.out.print("Enter the quantity of the product: ");
        int quantity = scanner.nextInt();
        System.out.print("Are you a member of this store (true/false): ");
        boolean isMember = scanner.nextBoolean();
        double total = calculatePrice(quantity,price,isMember);
        System.out.printf("The total is: %.3f",total);
        scanner.close();
    }
}
