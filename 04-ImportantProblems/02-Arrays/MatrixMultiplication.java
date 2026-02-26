import java.util.Scanner;

public class MatrixMultiplication {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);

        // Matrix 1
        System.out.print("Enter the number of rows for Matrix 1: ");
        int rows1 = scanner.nextInt();
        System.out.print("Enter the number of columns for Matrix 1: ");
        int cols1 = scanner.nextInt();
        int[][] matrix1 = new int[rows1][cols1];
        for(int i=0; i<rows1; i++){
            for(int j=0; j<cols1; j++){
                System.out.printf("Enter the element at Matrix1[%d][%d]: ",i,j);
                matrix1[i][j] = scanner.nextInt();
            }
        }

        // Matrix 2
        System.out.print("Enter the number of rows for Matrix 2: ");
        int rows2 = scanner.nextInt();
        System.out.print("Enter the number of columns for Matrix 2: ");
        int cols2 = scanner.nextInt();
        // Checking if Matrix Multiplication is possible or not.
        if(cols1 == rows2) {
            int[][] matrix2 = new int[rows2][cols2];
            for (int i = 0; i < rows2; i++) {
                for (int j = 0; j < cols2; j++) {
                    System.out.printf("Enter the element at Matrix2[%d][%d]: ", i, j);
                    matrix2[i][j] = scanner.nextInt();
                }
            }
            int[][] multipliedMatrix = new int[rows1][cols2];
            for(int i=0; i<rows1; i++){
                for(int j=0; j<cols2; j++){
                    for(int k=0; k<rows2; k++){
                        multipliedMatrix[i][j] += matrix1[i][k] * matrix2[k][j];
                    }
                }
            }
            System.out.println("The resultant matrix is: 👇");
            for(int[] arr: multipliedMatrix){
                for(int i: arr){
                    System.out.printf("%4d ",i);
                }
                System.out.println();
            }
        } else {
            System.out.print("❌Matrix Multiplication not possible. The number of columns of Matrix 1 should be equal to the number of rows of Matrix 2.");
        }
    }
}
