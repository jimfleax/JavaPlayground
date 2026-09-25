// Day 6 — Number Problem Demo
public class Day06NumberProblems {
    public static void main(String[] args) {
        int n = 5724;

        int temp = n;
        int digitCount = 0;
        int digitSum = 0;
        int maxDigit = 0;
        int reverse = 0;

        if (temp == 0) {
            digitCount = 1;
        }

        while (temp > 0) {
            int digit = temp % 10;
            digitCount++;
            digitSum += digit;
            maxDigit = Math.max(maxDigit, digit);
            reverse = reverse * 10 + digit;
            temp /= 10;
        }

        System.out.println("Number = " + n);
        System.out.println("Digits = " + digitCount);
        System.out.println("Digit Sum = " + digitSum);
        System.out.println("Largest Digit = " + maxDigit);
        System.out.println("Reverse = " + reverse);
        System.out.println("Palindrome = " + (reverse == n));
    }
}
