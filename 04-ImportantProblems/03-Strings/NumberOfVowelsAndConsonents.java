import java.util.Scanner;

public class NumberOfVowelsAndConsonents {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the string: ");
        StringBuilder sb = new StringBuilder(scanner.nextLine().toLowerCase().replaceAll("\\s+",""));

        int vowel = 0, consonant = 0;
        for(int i=0; i<sb.length(); i++){
            char ch = sb.charAt(i);
            if(Character.isLetter(ch)) {
                if ("aeiou".indexOf(ch) != -1) {
                    vowel++;
                } else {
                    consonant++;
                }
            }
        }

        System.out.printf("The number of vowels are %d and consonants are %d",vowel, consonant);
    }
}
