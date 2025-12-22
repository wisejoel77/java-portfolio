// Printing sum of all elements of an Integer array using for each loop

public class ForEachLoop1 {
    public static void main(String[] args){
        int[] arr = {9,5,4,2,5,3,355,64523,123,13,77};
        int sum = 0;
        for(int i : arr){
            sum += i;
        }
        System.out.print("The sum is: "+sum);
    }
}
