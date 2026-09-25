package Patterns;

import java.util.Scanner;

/**
 * TASK: Diamond Pattern
 * 
 * PROBLEM STATEMENT:
 * Write a program to print a diamond shape using asterisks (*). 
 * You have already built triangles and pyramids; a diamond is essentially 
 * an upright pyramid followed by an inverted pyramid.
 * 
 * CONCEPTS COVERED:
 * - Nested Loops (for loop inside for loop)
 * - String/character printing logic
 * 
 * EXPECTED OUTPUT FORMAT:
 * Enter size (half height of diamond): 4
 *    * 
 *   * * 
 *  * * * 
 * * * * * 
 *  * * * 
 *   * * 
 *    * 
 * 
 * HOW TO VERIFY:
 * Run it with different sizes (e.g., 3, 5). Ensure the middle row 
 * connects seamlessly and there is symmetry on both sides.
 */
public class DiamondPattern {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter size (half height of diamond): ");
        int size = scanner.nextInt();

        // TODO: Write logic for the top half of the diamond (including the middle row)
        // Hint: You can use your Pyramid logic here!


        // TODO: Write logic for the bottom half of the diamond (inverted pyramid)
        // Hint: This will be another set of nested loops, but iterating backwards.


        scanner.close();
    }
}
