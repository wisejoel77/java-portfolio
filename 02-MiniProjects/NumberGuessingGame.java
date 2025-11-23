/*        Problem Statement
        Create a Java application that simulates a Number Guessing Game with the following features:
        1.	Game Initialization:
        o	The computer randomly selects a secret number within a user-defined range (e.g., 1 to 100).
        o	The player is informed about the range and the maximum number of allowed attempts.
        2.	Gameplay Mechanics:
        o	The player inputs their guess.
        o	The program provides feedback:
        	"Too High" if the guess is greater than the secret number.
        	"Too Low" if the guess is less than the secret number.
        	"Correct!" if the guess matches the secret number.
        o	The number of remaining attempts is displayed after each guess.
        3.	Game Termination:
        o	The game ends when the player either guesses the correct number or exhausts all attempts.
        o	Upon game end, display an appropriate message indicating whether the player won or lost.
        4.	Input Validation:
        o	Ensure that the player's input is within the specified range.
        o	Handle invalid inputs gracefully by prompting the player to enter a valid number without consuming an attempt.
*/

import java.util.Random;
import java.util.Scanner;

public class NumberGuessingGame {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        final int secretNumber = random.nextInt(100)+1;
        System.out.println("--------------------");
        System.out.println("Number Guessing Game");
        System.out.println("--------------------\n");
        int attempts;
        while(true) {
            System.out.print("Choose your Difficulty(Easy/Medium/Hard): ");
            String difficulty = scanner.next().toLowerCase();
            attempts = switch (difficulty) {
                case "easy" -> 10;
                case "medium" -> 5;
                case "hard" -> 2;
                case "wise" -> 1;
                default -> 999;
            };
            if(attempts==999) {
                System.out.println("Invalid input. Please enter Easy/Medium/Hard only.");
            } else
                break;
        }
        System.out.printf("You have %d attempts to guess the number. The range is 1 to 100.\n",attempts);
        while(attempts>0){
            System.out.print("-> Enter the number: ");
            int choice = scanner.nextInt();
            if(choice<=100 && choice>=1) {
                if(choice==secretNumber){
                    System.out.println("\n\"Correct\".");
                    System.out.println("Congratulations! You have guessed the number. You won \u270C");
                    break;
                } else if(choice<secretNumber){
                    System.out.printf("Oops! \"Too Low\". You have %d attempts left.\n",--attempts);
                } else {
                    System.out.printf("Oops! \"Too High\". You have %d attempts left.\n",--attempts);
                }
            } else {
                System.out.printf("Invalid input, Please guess within the range(1-100). You still have %d attempts.",attempts);
            }
        }
        if(attempts==0) {
            System.out.print("You have exhausted all the attempts. You lost \uD83D\uDC80\n");
            System.out.printf("The secret number was: %d \uD83D\uDE04",secretNumber);
        }
        scanner.close();
    }
}
