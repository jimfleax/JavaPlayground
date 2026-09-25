import java.util.Scanner;

public class SmartNumberAnalyzer {
    
    public static void checkSign(int n) {
        if (n > 0) {
            System.out.println("Sign: Positive");
        } else if (n < 0) {
            System.out.println("Sign: Negative");
        } else {
            System.out.println("Sign: Zero");
        }
    }
    
    public static void checkEvenOdd(int n) {
        if (n % 2 == 0) {
            System.out.println("Parity: Even");
        } else {
            System.out.println("Parity: Odd");
        }
    }
    
    public static void checkPrime(int n) {
        if (n <= 1) {
            System.out.println("Prime: Not Prime");
            return;
        }
        boolean isPrime = true;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) {
            System.out.println("Prime: Prime");
        } else {
            System.out.println("Prime: Not Prime");
        }
    }
    
    public static void countDigits(int n) {
        int temp = Math.abs(n);
        int count = 0;
        if (temp == 0) {
            count = 1;
        } else {
            while (temp > 0) {
                count++;
                temp /= 10;
            }
        }
        System.out.println("Digit Count: " + count);
    }
    
    public static int getReverse(int n) {
        int temp = Math.abs(n);
        int reverse = 0;
        while (temp > 0) {
            reverse = (reverse * 10) + (temp % 10);
            temp /= 10;
        }
        if (n < 0) {
            return -reverse;
        }
        return reverse;
    }
    
    public static void checkPalindrome(int n) {
        int reversed = getReverse(n);
        if (n == reversed) {
            System.out.println("Palindrome: Yes");
        } else {
            System.out.println("Palindrome: No");
        }
    }
    
    public static void printReverse(int n) {
        System.out.println("Reverse: " + getReverse(n));
    }
    
    public static void analyze(int n) {
        System.out.println("--- Analysis for " + n + " ---");
        checkSign(n);
        checkEvenOdd(n);
        checkPrime(n);
        countDigits(n);
        printReverse(n);
        checkPalindrome(n);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number to analyze: ");
        int n = sc.nextInt();
        
        analyze(n);
        
        sc.close();
    }
}
