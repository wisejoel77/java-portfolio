package com.wisejoel77.LambdaExpressions.DailyMotivationGenerator;

public class DailyMotivationGenerator{
    public static void main(String[] args){
        System.out.println("======= Daily Motivation Generator =======");
        MessageGenerator post = () -> "Today is a new chance to grow, so focus on small steps and make it count.";
        System.out.print("Today's message: " + post.generateMessage());
    }
}
