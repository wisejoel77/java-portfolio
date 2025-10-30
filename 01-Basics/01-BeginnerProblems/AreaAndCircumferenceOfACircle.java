import java.util.Scanner;

public class AreaAndCircumferenceOfACircle {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        final float PI = 3.14f;
        double radius;
        System.out.print("Enter radius of the circle: ");
        radius = scanner.nextDouble();

        double area = PI * ( radius*radius );
        double circumference = 2*PI*radius;

        System.out.printf("The area of a circle with radius %.2f is: %.2f",radius,area);
        System.out.printf("\nThe circumference of a circle with radius %.2f is: %.2f",radius,circumference);
    }
}
