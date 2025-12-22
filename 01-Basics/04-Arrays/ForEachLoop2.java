// Printing how many times a specific character appears in a given character array

public class ForEachLoop2 {
    public static void main(String[] args){
        char[] letters = {'a','a','b','c','a','b'};
        int aCount = 0, bCount = 0, cCount = 0, dCount = 0;
        for (char ch : letters){
            switch(ch){
                case 'a' -> aCount++;
                case 'b' -> bCount++;
                case 'c' -> cCount++;
                case 'd' -> dCount++;
            }
        }
        System.out.println("+++++ CHARACTER COUNTS +++++");
        System.out.println("a = "+aCount);
        System.out.println("b = "+bCount);
        System.out.println("c = "+cCount);
        System.out.println("d = "+dCount);
    }
}
