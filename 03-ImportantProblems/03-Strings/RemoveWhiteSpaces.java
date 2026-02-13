import java.util.Scanner;

public class RemoveWhiteSpaces {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = scanner.nextLine();
        String replacedString = str.replaceAll("\\s+", "");
        System.out.print("The string after removing whitespaces is: " + replacedString);
    }
}
