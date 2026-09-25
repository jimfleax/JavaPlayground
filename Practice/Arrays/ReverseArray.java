package Arrays;

import java.util.Scanner;

/**
 * TASK: Reverse an Array
 * 
 * PROBLEM STATEMENT:
 * Write a program that takes an array of integers and reverses its elements. 
 * You can either reverse the array in-place (modifying the original array) 
 * or create a new array with the reversed elements.
 * 
 * CONCEPTS COVERED:
 * - Arrays
 * - For Loops
 * 
 * EXPECTED OUTPUT FORMAT:
 * Original Array: [1, 2, 3, 4, 5]
 * Reversed Array: [5, 4, 3, 2, 1]
 * 
 * HOW TO VERIFY:
 * Run the program. The printed 'Reversed Array' should be the exact 
 * mirror opposite of the 'Original Array'. Try changing the numbers 
 * in the array to ensure it works dynamically.
 */
public class ReverseArray {
    public static void main(String[] args) {
        // Here is a sample array to get you started
        int[] arr = {1, 2, 3, 4, 5};
        
        System.out.print("Original Array: ");
        printArray(arr);

        // TODO: Write your logic here to reverse the array
        
        System.out.print("Reversed Array: ");
        // TODO: Print the reversed array
        
    }

    // Helper method to print arrays easily
    static void printArray(int[] arr) {
        System.out.print("[");
        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i]);
            if (i < arr.length - 1) {
                System.out.print(", ");
            }
        }
        System.out.println("]");
    }
}
