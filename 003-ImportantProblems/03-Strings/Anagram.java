import java.util.Scanner;

public class Anagram {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the first word: ");
        String w1 = scanner.nextLine().trim().toLowerCase().replaceAll("\\s+","");
        System.out.print("Enter the second word: ");
        StringBuilder w2 = new StringBuilder(scanner.nextLine().trim().toLowerCase().replaceAll("\\s+",""));

        if(w1.length() == w2.length()){
            for(int i=0; i<w1.length(); i++){
                for(int j=0; j<w2.length(); ){
                    if(w1.charAt(i) == w2.charAt(j)){
                        w2.deleteCharAt(j);
                    } else{
                        j++;
                    }
                }
            }
        }

        if(w2.isEmpty()){
            System.out.print("The given words are anagram.");
        } else{
            System.out.print("The given words are not anagram.");
        }
        scanner.close();
    }
}
