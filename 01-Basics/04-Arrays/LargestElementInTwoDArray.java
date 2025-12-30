import java.util.Scanner;

public class LargestElementInTwoDArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter the number of columns: ");
        int cols = scanner.nextInt();

        int[][] array = new int[rows][cols];

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.printf("Enter the element at array[%d][%d]: ",i,j);
                array[i][j] = scanner.nextInt();
            }
        }
        int big = array[0][0];

        for(int[] arr: array){
            for(int i: arr){
                if(i > big){
                    big = i;
                }
            }
        }
        System.out.printf("The biggest element in the array is: %d",big);
        scanner.close();
    }
}
