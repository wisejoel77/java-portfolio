package com.wisejoel77.CollectionsFramework.ArrayList;

import java.util.ArrayList;
import java.util.Scanner;

public class NumberStatisticsAnalyzer {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter the numbers: ");
        ArrayList<Integer> numbers = new ArrayList<>();
        int sum = 0, count = 0, average, largest = Integer.MIN_VALUE, smallest = Integer.MAX_VALUE, evenNumbers = 0, oddNumbers = 0, numbersAboveAverage = 0;
        while(scanner.hasNextInt()){
            count++;
            int number = scanner.nextInt();
            sum += number;
            if(number < smallest){
                smallest = number;
            }

            if (number > largest){
                largest = number;
            }

            if (number % 2 == 0){
                evenNumbers++;
            } else {
                oddNumbers++;
            }
            numbers.add(number);
        }
        average = sum / count;
        System.out.println();

        for (Integer number : numbers) {
            if (number > average) {
                numbersAboveAverage++;
            }
        }

        System.out.println("####### Analytics #######");
        System.out.println("Total numbers: " + count);
        System.out.println("Sum: " + sum);
        System.out.println("Average: " + average);
        System.out.println("Smallest: " + smallest);
        System.out.println("Largest: " + largest);
        System.out.println("Even numbers: " + evenNumbers);
        System.out.println("Odd numbers: " + oddNumbers);
        System.out.print("Numbers above average: " + numbersAboveAverage);
    }
}

/*
Example output:
Enter the numbers: 12 45 7 23 18 90 34 11 56 29 72 5 41 88 16 63 27 94 38 71 9 52 84 31 67 14 99 43 25 76 end

####### Analytics #######
Total numbers: 30
Sum: 1340
Average: 44
Smallest: 5
Largest: 99
Even numbers: 14
Odd numbers: 16
Numbers above average: 13
 */
