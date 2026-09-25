import java.util.Scanner;

public class Calculator {
    
    public static int add(int a, int b) {
        return a + b;
    }
    
    public static int subtract(int a, int b) {
        return a - b;
    }
    
    public static int multiply(int a, int b) {
        return a * b;
    }
    
    public static double divide(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Division by zero");
            return 0; 
        }
        return (double) a / b;
    }
    
    public static int modulo(int a, int b) {
        if (b == 0) {
            System.out.println("Error: Modulo by zero");
            return 0;
        }
        return a % b;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        
        System.out.println("Add: " + add(a, b));
        System.out.println("Subtract: " + subtract(a, b));
        System.out.println("Multiply: " + multiply(a, b));
        
        if (b != 0) {
            System.out.println("Divide: " + divide(a, b));
            System.out.println("Modulo: " + modulo(a, b));
        } else {
            // Trigger the divide by zero handling logic
            divide(a, b);
            modulo(a, b);
        }
        
        sc.close();
    }
}
