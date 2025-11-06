//Write a Java program that checks whether a given character is a vowel or a consonant using if-else

import java.util.Scanner;

public class VowelOrConsonant {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter an alphabet: ");
        char c = scanner.next().charAt(0);
        if (c=='A' || c=='a') {
            System.out.printf("%c is a vowel.",c);
        } else if (c=='E' || c=='e') {
            System.out.printf("%c is a vowel.",c);
        } else if (c=='I' || c=='i') {
            System.out.printf("%c is a vowel.",c);
        } else if (c=='O' || c=='o') {
            System.out.printf("%c is a vowel.",c);
        } else if (c=='U' || c=='u') {
            System.out.printf("%c is a vowel.",c);
        } else {
            System.out.printf("%c is a consonant.",c);
        }
        scanner.close();
    }
}
