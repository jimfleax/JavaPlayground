public class Problem23_IsPrimeAndOdd {
    public static boolean isPrime(int n) {
        if (n <= 1) return false;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) return false;
        }
        return true;
    }
    public static boolean isPrimeAndOdd(int n) {
        return n % 2 != 0 && isPrime(n);
    }
    public static void main(String[] args) {
        System.out.println(isPrimeAndOdd(7));
    }
}
