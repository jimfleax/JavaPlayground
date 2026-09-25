import java.util.Scanner;

public class Day07MethodsFunctions {
    static void greet(String name) {
        System.out.println("Hello, " + name + "!");
    }

    static int add(int a, int b) {
        return a + b;
    }

    static boolean isEven(int n) {
        return n % 2 == 0;
    }

    static int maxOfThree(int a, int b, int c) {
        int max = a;
        if (b > max) max = b;
        if (c > max) max = c;
        return max;
    }

    static int square(int n) {
        return n * n;
    }

    static int sumOfSquares(int a, int b) {
        return square(a) + square(b);
    }

    static boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }

    static int add(int a, int b, int c) {
        return a + b + c;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        greet("Java Learner");
        System.out.println("Add = " + add(10, 20));
        System.out.println("Even? " + isEven(14));
        System.out.println("Max = " + maxOfThree(8, 25, 17));
        System.out.println("Sum of squares = " + sumOfSquares(3, 4));
        System.out.println("Prime? " + isPrime(29));
        System.out.println("Overloaded add = " + add(1, 2, 3));

        System.out.print("Enter a number to test prime: ");
        int n = sc.nextInt();
        System.out.println(isPrime(n) ? "Prime" : "Not Prime");
    }
}
