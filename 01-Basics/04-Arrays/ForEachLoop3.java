// Printing all the even numbers from an integer array

public class ForEachLoop3 {
    public static void main(String[] args){
        int[] arr = new int[] {1,2,3,4,5,6,7,8,9,10};
        System.out.print("The even numbers in the array are: ");
        for(int n : arr){
            if(n%2==0){
                System.out.print(n+" ");
            }
        }
    }
}
