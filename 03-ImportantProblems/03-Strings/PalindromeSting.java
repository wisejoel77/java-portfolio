import java.util.Scanner;

public class PalindromeSting {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        StringBuilder sb = new StringBuilder(scanner.nextLine().toLowerCase().replaceAll("\\s+",""));
        byte flag = 0;
        for(int i=0, j=sb.length()-1; i<j; i++,j--){
            char c1 = sb.charAt(i);
            char c2 = sb.charAt(j);
            if(c1 != c2){
                System.out.print("The given string is not a palindrome");
                flag++;
                break;
            }
        }
        if(flag==0){
            System.out.print("The given string is a palindrome");
        }
        scanner.close();
    }
}
