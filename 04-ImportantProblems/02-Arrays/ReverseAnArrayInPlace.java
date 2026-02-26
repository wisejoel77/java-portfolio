// WAP to reverse an array in place

import java.util.Arrays;
import java.util.Scanner;

public class ReverseAnArrayInPlace {
    static int[] reverseArray(int[] array){
        int r = array.length-1, temp;
        for(int i=0; i<array.length; i++){
            temp = array[i];
            array[i] = array[r];
            array[r] = temp;
            r--;
            if((i+1)==r)
                break;
        }
        return array;
    }
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int length = scanner.nextInt();
        int[] array = new int[length];
        for(int i=0; i<array.length; i++){
            System.out.printf("Enter the element at array[%d]: ",i);
            array[i] = scanner.nextInt();
        }
        int[] reversedArray = reverseArray(array);
        System.out.print(Arrays.toString(reversedArray));
        scanner.close();
    }
}
