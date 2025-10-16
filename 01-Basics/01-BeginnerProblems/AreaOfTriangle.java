import java.util.Scanner;

public class AreaOfTriangle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the height of the triangle: ");
        double height = scanner.nextDouble();
        System.out.print("Enter the base of the triangle: ");
        double base = scanner.nextDouble();
        double area = 0.5 * base * height;
        System.out.printf("The area of the triangle is %.3f", area);
    }
}
