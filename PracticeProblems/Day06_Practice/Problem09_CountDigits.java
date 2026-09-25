import java.util.Scanner;
public class Problem09_CountDigits {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter positive integer: ");
        int n = sc.nextInt();
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        System.out.println("Digits: " + count);
    }
}
