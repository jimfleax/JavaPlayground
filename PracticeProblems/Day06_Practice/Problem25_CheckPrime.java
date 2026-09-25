import java.util.Scanner;
public class Problem25_CheckPrime {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        boolean isPrime = n > 1;
        for (int i = 2; i * i <= n; i++) {
            if (n % i == 0) {
                isPrime = false;
                break;
            }
        }
        if (isPrime) System.out.println(n + " is prime");
        else System.out.println(n + " is not prime");
    }
}
