import java.util.Scanner;
public class Problem15_CountEvenOddDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer: ");
        int n = sc.nextInt();
        int even = 0, odd = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit % 2 == 0) {
                even++;
            } else {
                odd++;
            }
            n /= 10;
        }
        System.out.println("Even digits: " + even);
        System.out.println("Odd digits: " + odd);
    }
}
