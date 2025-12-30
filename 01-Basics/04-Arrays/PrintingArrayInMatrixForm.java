import java.util.Scanner;

public class PrintingArrayInMatrixForm {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter no.of rows: ");
        int rows = scanner.nextInt();
        System.out.print("Enter no.of cols: ");
        int cols = scanner.nextInt();

        int[][] array = new int[rows][cols];

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.printf("Enter the element at array[%d][%d]: ",i,j);
                array[i][j] = scanner.nextInt();
            }
        }

        System.out.println("The array in matrix form is 👇");

        for(int i=0; i<rows; i++){
            for(int j=0; j<cols; j++){
                System.out.printf("%4d",array[i][j]);
                if(j<cols-1){
                    System.out.print(" ");
                }
            }
            System.out.println();
        }
        scanner.close();
    }
}
