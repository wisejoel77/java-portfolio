// Create String array with 5 colors
// Use For Each Loop to print colors
// Print index of each color (Bonus)

public class ForEachLoop4 {
    public static void main(String[] args){
        String[] colors = {"red", "blue", "black", "violet", "pink", "yellow", "orange"};
        System.out.print("The colors are: ");
        for(String color : colors){
            System.out.print(color + ", ");
        }
        System.out.print("\b\b");
        System.out.print("\n\nThe indexes of the colors are:\n");
        for(int i=0; i<colors.length; i++){
            System.out.println(colors[i] + ": " + i);
        }
    }
}
