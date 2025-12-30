import java.util.Scanner;

public class SumOfElementsInTwoDArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        System.out.print("Enter number of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter number of columns: ");
        int cols = scanner.nextInt();

        int[][] array = new int[rows][cols];

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.printf("Enter the element at array[%d][%d]: ",i,j);
                array[i][j] = scanner.nextInt();
            }
        }

        int sum=0;
        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                sum += array[i][j];
            }
        }

        System.out.printf("The sum of all the elements in the array is: %d",sum);
        scanner.close();
    }
}
