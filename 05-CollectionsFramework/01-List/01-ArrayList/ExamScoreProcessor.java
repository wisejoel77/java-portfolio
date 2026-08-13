package com.wisejoel77.CollectionsFramework.ArrayList;

import java.util.ArrayList;
import java.util.ListIterator;
import java.util.Scanner;

public class ExamScoreProcessor {
    // This program removes score below 35 (failed) and change negative marks to positive (mistaken)
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        ArrayList<Integer> marks = new ArrayList<>();
        System.out.print("Enter marks (-1 to stop): ");
        int n;
        while((n = scanner.nextInt()) != -1){
            marks.add(n);
        }

        ListIterator<Integer> iterator = marks.listIterator();
        while(iterator.hasNext()){
            int score = iterator.next();
            if(Math.signum(score) == -1){
                if(Math.abs(score) < 35){
                    iterator.remove();
                } else {
                    iterator.set(Math.abs(score));
                }
            } else if (score < 35){
                iterator.remove();
            }
        }

        System.out.println("Valid marks count: " + marks.size());
        System.out.print("Processed marks: " + marks);
        scanner.close();
    }
}

/*
Example output:
Enter marks (-1 to stop): 99 45 -60 -2 3 4 9 22 45 93 23 23 -100 -1
Valid marks count: 6
Processed marks: [99, 45, 60, 45, 93, 100]
 */
