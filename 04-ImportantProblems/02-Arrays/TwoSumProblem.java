import java.util.Scanner;

/*Given an array of integers, return the indices of two numbers that add up to a target.
Input:
nums = [2, 7, 11, 15], target = 9

Output:
[0, 1]

[Each input would have exactly one solution]
*/
public class TwoSumProblem {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the size of the array: ");
        int size = scanner.nextInt();
        int[] array = new int[size];
        for(int i=0; i<size; i++){
            System.out.printf("Enter the element at array[%d]: ",i);
            array[i] = scanner.nextInt();
        }
        System.out.print("Enter the target value: ");
        int target = scanner.nextInt();
        for(int i=0; i<size; i++){
            for(int j=i+1; j<size; j++){
                int sum=0;
                sum = array[i] + array[j];
                if(sum==target) {
                    System.out.printf("[%d, %d]", i, j);
                    return;
                }
            }
        }
    }
}
