package com.wisejoel77.LambdaExpressions.NumberOperationProcessor;

import java.util.Scanner;
import java.util.function.UnaryOperator;

public class NumberOperationProcessor {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number to get the square of: ");
        int square = scanner.nextInt();
        System.out.print("Enter a number to get the cube of: ");
        int cube = scanner.nextInt();

        UnaryOperator<Integer> getSquare = n -> n*n;
        UnaryOperator<Integer> getCube = n -> n*n*n;

        System.out.println("Square is: " + getAnswer(square, getSquare));
        System.out.println("Cube is: " + getAnswer(cube, getCube));
        scanner.close();
    }

    static <T> T getAnswer(T n, UnaryOperator<T> behaviour){
        return behaviour.apply(n);
    }
}
