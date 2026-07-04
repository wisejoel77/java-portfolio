import java.util.Scanner;

public class RemovingDuplicateCharacters {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        StringBuilder sb = new StringBuilder(scanner.next().trim().toLowerCase());
        for(int i=0; i<sb.length()-1; i++){
            char ch = sb.charAt(i);
            for(int j=i+1; j<sb.length();) {
                if (ch == sb.charAt(j)){
                    sb.deleteCharAt(j);
                } else{
                    j++;
                }
            }
        }
        System.out.print("The string after removing duplicate strings is: " + sb);
    }
}
