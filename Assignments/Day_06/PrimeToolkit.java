import java.util.Scanner;

public class PrimeToolkit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer N: ");
        int n = sc.nextInt();
        
        // 1. Check whether N is prime
        boolean isNPrime = true;
        if (n <= 1) {
            isNPrime = false;
        } else {
            // Check up to square root of N
            for (int i = 2; i * i <= n; i++) {
                if (n % i == 0) {
                    isNPrime = false;
                    break;
                }
            }
        }
        System.out.println("Is " + n + " prime? " + isNPrime);
        
        // 2 & 3. Print all prime numbers from 1 to N and their count
        System.out.print("Primes from 1 to " + n + ": ");
        int count = 0;
        for (int i = 2; i <= n; i++) {
            boolean isPrime = true;
            // Prime check for each number i
            for (int j = 2; j * j <= i; j++) {
                if (i % j == 0) {
                    isPrime = false;
                    break;
                }
            }
            if (isPrime) {
                System.out.print(i + " ");
                count++;
            }
        }
        System.out.println();
        System.out.println("Count of primes from 1 to " + n + ": " + count);
        
        sc.close();
    }
}
