import java.util.Scanner;

public class TotalNumberOfElementsInEachRowInJaggedArray {
    static Scanner scanner = new Scanner(System.in);
    public static void main(String[] args){
        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        int[][] array = new int[rows][];
        for(int i=0; i<rows; i++){
            System.out.printf("Enter number of columns for row %d: ",i+1);
            int cols = scanner.nextInt();
            array[i] = new int[cols];
        }

        for(int i=0; i<rows; i++){
            for(int j=0; j<array[i].length; j++){
                System.out.printf("Enter the element at array[%d][%d]: ",i,j);
                array[i][j] = scanner.nextInt();
            }
        }

        // Printing The Jagged Array in Matrix Form
        System.out.println("The elements in The Jagged Array are: 👇");
        for(int[] arr: array){
            for(int i: arr){
                System.out.printf("%4d ",i);
            }
            System.out.println();
        }

        // Printing number of elements in each row
        System.out.println("The number of elements in each row are: 👇");
        int r=1;
        for(int[] arr: array){
            int count = 0;
            for(int i: arr){
                count++;
            }
            System.out.printf("Row %d has %d elements",r,count);
            System.out.println();
            r++;
        }
    }
}
