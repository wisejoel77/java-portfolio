import java.util.Scanner;

public class M03AreaAndCircumferenceOfACircle {
    static void areaAndCircumferenceCircle(double r){
        double area = Math.PI*r*r;
        double circumference = 2*Math.PI*r;
        System.out.printf("The area is: %.3f\n",area);
        System.out.printf("The circumference is: %.3f",circumference);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the radius: ");
        double radius = scanner.nextDouble();
        areaAndCircumferenceCircle(radius);
        scanner.close();
    }
}
