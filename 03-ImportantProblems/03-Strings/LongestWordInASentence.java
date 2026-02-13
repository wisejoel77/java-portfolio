import java.util.Scanner;

public class LongestWordInASentence {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        String str = scanner.nextLine().trim();
        String[] array = str.split(" ");
        int max = 0;
        String word = "";
        for(int i=0; i< array.length; i++){
            if(array[i].length() > max){
                word = array[i];
                max = array[i].length();
            }
        }
        System.out.printf("The longest word of length %d is %s", max, word);
    }
}
