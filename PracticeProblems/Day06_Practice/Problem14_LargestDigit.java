import java.util.Scanner;
public class Problem14_LargestDigit {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter integer: ");
        int n = sc.nextInt();
        int maxDigit = 0;
        while (n > 0) {
            int digit = n % 10;
            if (digit > maxDigit) {
                maxDigit = digit;
            }
            n /= 10;
        }
        System.out.println("Largest digit: " + maxDigit);
    }
}
