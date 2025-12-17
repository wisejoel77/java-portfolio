public class MethodOverloading {

    static void calculate(int a, int b){
        System.out.printf("The sum is: %d%n",a+b);
    }

    static void calculate(double a, double b){
        System.out.printf("The sum is: %f%n",a+b);
    }

    static void calculate(int a, int b, String str){
        if (str.equals("+")){
            System.out.printf("The sum is: %d%n",a+b);
        } else if (str.equals("-")){
            System.out.printf("The difference is: %d%n",a-b);
        } else if(str.equals("*")){
            System.out.printf("The product is: %d%n",a*b);
        } else if(str.equals("/")){
            System.out.printf("The quotient is: %d%n",a/b);
        } else if(str.equals("%")){
            System.out.printf("The remainder is: %d%n",a%b);
        }
    }

    public static void main(String[] args){
        calculate(10,5);
        calculate(10.5,10.5);
        calculate(5,2,"+");
        calculate(5,2,"-");
        calculate(5,2,"*");
        calculate(5,2,"/");
        calculate(5,2,"%");
    }
}
