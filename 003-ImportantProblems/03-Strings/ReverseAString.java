import java.util.Scanner;

public class ReverseAString {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        StringBuilder sb = new StringBuilder(scanner.nextLine());
        for(int i=0, j=sb.length()-1; i<=(sb.length()-1)/2; i++,j--){
            char temp = sb.charAt(i);
            sb.setCharAt(i, sb.charAt(j));
            sb.setCharAt(j,temp);
        }
        System.out.print("The reversed string is: " + sb);
        scanner.close();
    }
}
