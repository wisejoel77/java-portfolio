import java.util.Scanner;

public class ToggleCharacters {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        StringBuilder sb = new StringBuilder(scanner.nextLine().trim());
        for(int i=0; i<sb.length(); i++){
            char ch = sb.charAt(i);
            if(Character.isLetter(ch)){
                if(Character.isUpperCase(ch)){
                    sb.setCharAt(i,Character.toLowerCase(ch));
                } else{
                    sb.setCharAt(i,Character.toUpperCase(ch));
                }
            }
        }
        System.out.print("The resultant string is: " + sb);
    }
}
