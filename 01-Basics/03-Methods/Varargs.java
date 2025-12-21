public class Varargs {
    static void calculate(int... a){
        int sum = 0;
        for(int i=0; i<a.length; i++){
            sum += a[i];
        }
        System.out.printf("The sum is: %d\n",sum);
    }
    public static void main(String[] args){
        calculate();
        calculate(1);
        calculate(1,2,3,4,5);
        calculate(1,2,3,4,5,6,7,8,9,10);
    }
}
