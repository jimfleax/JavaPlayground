package Methods;

import java.util.Scanner;

/**
 * TASK: Temperature Converter using Methods
 * 
 * PROBLEM STATEMENT:
 * Write a program that provides a menu to the user to either:
 * 1. Convert Celsius to Fahrenheit
 * 2. Convert Fahrenheit to Celsius
 * 
 * Implement the conversion logic inside separate static methods, not in main.
 * Formulas:
 * F = (C * 9/5) + 32
 * C = (F - 32) * 5/9
 * 
 * CONCEPTS COVERED:
 * - Static Methods with parameters and return types
 * - Scanner / User Input
 * - Switch or If-Else statements
 * 
 * EXPECTED OUTPUT FORMAT:
 * --- Temperature Converter ---
 * 1. Celsius to Fahrenheit
 * 2. Fahrenheit to Celsius
 * Select an option (1/2): 1
 * Enter temperature in Celsius: 25
 * 25.0 Celsius is equal to 77.0 Fahrenheit.
 * 
 * HOW TO VERIFY:
 * 0 Celsius should be 32 Fahrenheit.
 * 100 Celsius should be 212 Fahrenheit.
 * -40 Celsius should be -40 Fahrenheit.
 */
public class TemperatureConverter {
    
    // TODO: Write a method named celsiusToFahrenheit that takes a double and returns a double
    

    // TODO: Write a method named fahrenheitToCelsius that takes a double and returns a double
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("--- Temperature Converter ---");
        System.out.println("1. Celsius to Fahrenheit");
        System.out.println("2. Fahrenheit to Celsius");
        System.out.print("Select an option (1/2): ");
        int choice = scanner.nextInt();

        // TODO: Based on the user's choice, ask for the temperature, 
        // call the correct method, and print the result.
        
        scanner.close();
    }
}
