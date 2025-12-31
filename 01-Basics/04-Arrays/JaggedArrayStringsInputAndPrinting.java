import java.util.Scanner;

public class JaggedArrayStringsInputAndPrinting {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        String[][] array = new String[rows][];
        for(int i=0; i<rows; i++){
            System.out.printf("Enter the number of columns for Row %d: ",i+1);
            int cols = scanner.nextInt();
            array[i] = new String[cols];
        }
        scanner.nextLine();
        for(int i=0; i<rows; i++){
            for(int j=0; j<array[i].length; j++){
                System.out.printf("Enter the string at array[%d][%d]: ",i,j);
                array[i][j] = scanner.nextLine();
            }
        }

        for(String[] arr: array){
            for(String str: arr){
                System.out.printf("%s ",str);
            }
            System.out.println();
        }
        scanner.close();
    }
}
