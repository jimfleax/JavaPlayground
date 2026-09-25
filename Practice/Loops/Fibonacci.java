package Loops;

import java.util.Scanner;

/**
 * TASK: Fibonacci Sequence
 * 
 * PROBLEM STATEMENT:
 * Write a program that prints the first 'N' numbers of the Fibonacci sequence. 
 * The Fibonacci sequence starts with 0 and 1, and every subsequent number 
 * is the sum of the two preceding ones (0, 1, 1, 2, 3, 5, 8, 13...).
 * 
 * CONCEPTS COVERED:
 * - Scanner (User Input)
 * - Loops
 * - Variable swapping/updating
 * 
 * EXPECTED OUTPUT FORMAT:
 * Enter N: 7
 * Fibonacci Sequence: 0 1 1 2 3 5 8 
 * 
 * HOW TO VERIFY:
 * Run the program for various inputs like N=5, N=10, N=1.
 * Verify that the sum of the last two numbers always equals the current number.
 */
public class Fibonacci {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = scanner.nextInt();

        int firstTerm = 0;
        int secondTerm = 1;

        System.out.print("Fibonacci Sequence: ");

        // TODO: Write a loop that runs 'n' times.
        // Inside the loop, print the firstTerm, then calculate the next term,
        // and update the firstTerm and secondTerm variables.
        

        scanner.close();
    }
}
