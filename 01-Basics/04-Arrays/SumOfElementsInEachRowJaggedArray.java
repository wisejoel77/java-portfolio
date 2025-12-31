import java.util.Scanner;

public class SumOfElementsInEachRowJaggedArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the number of rows: ");
        int rows = scanner.nextInt();
        int[][] array = new int[rows][];
        for(int i=0; i<rows; i++){
            System.out.printf("Enter the number of columns for Row %d: ",i+1);
            int cols = scanner.nextInt();
            array[i] = new int[cols];
        }

        for(int i=0; i<rows; i++){
            for(int j=0; j<array[i].length; j++){
                System.out.printf("Enter the element at array[%d][%d]: ",i,j);
                array[i][j] = scanner.nextInt();
            }
        }
        int r=1;
        for(int[] arr: array){
            int sum = arr[0];
            for(int i: arr){
                sum += i;
            }
            sum -= arr[0];
            System.out.printf("Row %d -> Sum: %d\n",r++,sum);
        }
    }
}
