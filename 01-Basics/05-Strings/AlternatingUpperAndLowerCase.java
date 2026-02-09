import java.util.Scanner;

public class AlternatingUpperAndLowerCase {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = scanner.nextLine().trim();
        String result = "";
        for(int i=0; i<str.length(); i++){
            if(i%2==0){
                result += Character.toUpperCase(str.charAt(i));
            } else{
                result += Character.toLowerCase(str.charAt(i));
            }
        }
        System.out.print("The resultant string is: " + result);
        scanner.close();
    }
}
