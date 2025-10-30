import java.util.Scanner;

public class BMICalculator {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        float weight,height;

        System.out.print("Enter your weight(in kgs): ");
        weight = scanner.nextFloat();
        System.out.print("Enter your height(in meters): ");
        height = scanner.nextFloat();

        float BMI = weight/(height*height);

        System.out.printf("Your BMI is: %.2f",BMI);
    }
}
