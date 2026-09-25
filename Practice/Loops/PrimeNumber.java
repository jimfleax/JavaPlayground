package Loops;

import java.util.Scanner;

/**
 * TASK: Check Prime Number
 * 
 * PROBLEM STATEMENT:
 * Write a program that asks the user for a number, and then determines 
 * if that number is a Prime Number. A prime number is a number greater 
 * than 1 that has no positive divisors other than 1 and itself.
 * 
 * CONCEPTS COVERED:
 * - Scanner (User Input)
 * - Loops (For or While)
 * - Modulo Operator (%)
 * - Conditionals (if/else)
 * - Booleans / Flags
 * 
 * EXPECTED OUTPUT FORMAT:
 * Enter a number: 29
 * 29 is a prime number.
 * 
 * Enter a number: 15
 * 15 is not a prime number.
 * 
 * HOW TO VERIFY:
 * Test it with known prime numbers (2, 3, 5, 7, 11, 13, 17, 19) and 
 * non-prime numbers (4, 6, 8, 9, 15, 21). Make sure 0 and 1 are handled 
 * properly (they are not prime).
 */
public class PrimeNumber {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int number = scanner.nextInt();

        boolean isPrime = true;

        // TODO: Write a loop to check if the number is divisible by any integer from 2 up to number-1
        // Hint: use number % i == 0 to check divisibility
        

        // TODO: Print the final result based on the 'isPrime' flag
        
        scanner.close();
    }
}
