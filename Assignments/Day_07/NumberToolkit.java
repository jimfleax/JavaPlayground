import java.util.Scanner;

public class NumberToolkit {
    
    public static boolean isEven(int n) {
        return n % 2 == 0;
    }
    
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    
    public static int reverseNumber(int n) {
        int reverse = 0;
        int temp = Math.abs(n);
        while (temp > 0) {
            reverse = (reverse * 10) + (temp % 10);
            temp /= 10;
        }
        if (n < 0) {
            return -reverse;
        }
        return reverse;
    }
    
    public static boolean isPalindrome(int n) {
        return n == reverseNumber(n);
    }
    
    public static int sumDigits(int n) {
        int sum = 0;
        int temp = Math.abs(n);
        while (temp > 0) {
            sum += temp % 10;
            temp /= 10;
        }
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter an integer: ");
        int n = sc.nextInt();
        
        System.out.println("Is Even? " + isEven(n));
        System.out.println("Is Prime? " + isPrime(n));
        System.out.println("Reverse: " + reverseNumber(n));
        System.out.println("Is Palindrome? " + isPalindrome(n));
        System.out.println("Sum of Digits: " + sumDigits(n));
        
        sc.close();
    }
}
