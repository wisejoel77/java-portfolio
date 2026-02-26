//WAP to print an array in reverse order

import java.util.Scanner;

public class ReverseAnArray {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int length = scanner.nextInt();
        int[] array = new int[length];
        for(int i=0; i<array.length; i++){
            System.out.printf("Enter the element at array[%d]: ",i);
            array[i] = scanner.nextInt();
        }
        int[] newArray = new int[array.length];
        int r = array.length-1;
        for(int i=0; i<newArray.length; i++){
            newArray[i] = array[r];
            r--;
        }
        System.out.println("The reversed array is: 👇");
        for(int i:newArray){
            System.out.print(i + " ");
        }
        scanner.close();
    }
}
