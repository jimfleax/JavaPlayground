public class Problem25_IsArmstrong {
    public static int power(int a, int b) {
        int res = 1;
        for (int i = 1; i <= b; i++) res *= a;
        return res;
    }
    public static int countDigits(int n) {
        int count = 0;
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count;
    }
    public static boolean isArmstrong(int n) {
        int original = n;
        int digits = countDigits(n);
        int sum = 0;
        while (n > 0) {
            sum += power(n % 10, digits);
            n /= 10;
        }
        return sum == original;
    }
    public static void main(String[] args) {
        System.out.println(isArmstrong(153));
    }
}
