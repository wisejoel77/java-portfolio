import java.util.Scanner;

public class MaxElement {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        if(size>0) {
            int[] arr = new int[size];
            System.out.println("Enter the numbers: ");
            for (int i = 0; i < arr.length; i++) {
                arr[i] = scanner.nextInt();
            }
            int max = arr[0];
            for(int i=0; i<arr.length; i++) {
                if (max < arr[i])
                    max = arr[i];
            }
            System.out.print("The maximum number in the array is: " + max);
        } else{
            System.out.print("Array size must be greater than 0");

        }
        scanner.close();
    }
}
