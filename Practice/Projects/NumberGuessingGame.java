package Projects;

import java.util.Scanner;
import java.util.Random;

/**
 * TASK: Number Guessing Game
 * 
 * PROBLEM STATEMENT:
 * Write a mini-game where the computer generates a random number between 1 and 100.
 * The user has to keep guessing until they find the number.
 * After each guess, the computer should tell the user if their guess was "Too High" 
 * or "Too Low". Keep track of how many attempts the user took.
 * 
 * CONCEPTS COVERED:
 * - While loop
 * - Scanner / User Input
 * - Conditionals (if / else if / else)
 * - Basic classes (Random)
 * 
 * EXPECTED OUTPUT FORMAT:
 * Welcome to the Number Guessing Game!
 * I have selected a number between 1 and 100.
 * Enter your guess: 50
 * Too low! Try again.
 * Enter your guess: 75
 * Too high! Try again.
 * Enter your guess: 62
 * Congratulations! You guessed the number 62 in 3 attempts.
 * 
 * HOW TO VERIFY:
 * Play the game! Make sure it correctly guides you up or down, 
 * and ends immediately once you guess the exact number.
 */
public class NumberGuessingGame {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();
        
        // Generates a random number between 1 and 100
        int targetNumber = random.nextInt(100) + 1; 
        
        int attempts = 0;
        int guess = 0;
        
        System.out.println("Welcome to the Number Guessing Game!");
        System.out.println("I have selected a number between 1 and 100.");
        
        // TODO: Write a while loop that keeps asking the user for a guess 
        // until 'guess' equals 'targetNumber'.
        // Inside the loop:
        // 1. Take user input
        // 2. Increment attempts
        // 3. Print if it's too high or too low
        
        
        // TODO: Print the congratulatory message with the number of attempts
        
        scanner.close();
    }
}
