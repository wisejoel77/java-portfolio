package com.wisejoel77.LambdaExpressions.GenericBinaryOperator;

import java.util.Scanner;
import java.util.function.BinaryOperator;

public class GenericBinaryOperator {
    public static void main(String[] args){
        Scanner scanner= new Scanner(System.in);

        BinaryOperator<Integer> addition = Integer::sum;
        BinaryOperator<Integer> subtraction = (n1,n2) -> n1 - n2;
        BinaryOperator<String> concatenation = (str1, str2) -> str1 + " " + str2;
        BinaryOperator<Double> max = Math::max;

        System.out.println("======= Addition =======");
        System.out.print("Enter the first number: ");
        int num1 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num2 = scanner.nextInt();
        System.out.println("Sum: " + getAnswer(num1, num2, addition));
        System.out.println();
        System.out.println("======= Subtraction =======");
        System.out.print("Enter the first number: ");
        int num3 = scanner.nextInt();
        System.out.print("Enter the second number: ");
        int num4 = scanner.nextInt();
        System.out.println("Difference: " + getAnswer(num3, num4, subtraction));
        System.out.println();
        System.out.println("======= String Concatenation =======");
        System.out.print("Enter the first word: ");
        String word1 = scanner.next();
        System.out.print("Enter the second word: ");
        String word2 = scanner.next();
        System.out.println("Concatenated String: " + getAnswer(word1, word2, concatenation));
        System.out.println();
        System.out.println("======= Max Of Two Double Values =======");
        System.out.print("Enter the first number: ");
        Double num5 = scanner.nextDouble();
        System.out.print("Enter the second number: ");
        Double num6 = scanner.nextDouble();
        System.out.println("Max: " + getAnswer(num5, num6, max));
        scanner.close();
    }

    static <T> T getAnswer(T val1, T val2, BinaryOperator<T> behaviour){
        return behaviour.apply(val1, val2);
    }
}
