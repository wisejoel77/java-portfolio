import java.util.Scanner;

public class TransposeOfATwoDMatrix {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        int[][] array = new int[rows][cols];
        int[][] transposedArray = new int[cols][rows];

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.printf("Enter the element at array[%d][%d]: ",i,j);
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.println("The transpose of the given matrix is: 👇");

        for(int i=0; i<cols; i++){
            for(int j=0; j<rows; j++){
                transposedArray[i][j] = array[j][i];
            }
        }

        for(int[] arr: transposedArray){
            for(int i: arr){
                System.out.printf("%d ",i);
            }
            System.out.println();
        }
        scanner.close();
    }
}
