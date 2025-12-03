import java.util.Scanner;

public class M04GreetingMethod {
    static void greetNow(String name, String greeting){
        System.out.printf("Hello %s! Good %s",name,greeting);
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter your name: ");
        String name = scanner.nextLine();
        System.out.print("Enter the time of the day: ");
        String timeOfTheDay = scanner.nextLine();
        greetNow(name,timeOfTheDay);
    }
}
