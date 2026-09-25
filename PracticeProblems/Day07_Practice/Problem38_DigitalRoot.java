public class Problem38_DigitalRoot {
    public static int sumDigits(int n) {
        int sum = 0;
        while (n > 0) {
            sum += n % 10;
            n /= 10;
        }
        return sum;
    }
    public static int digitalRoot(int n) {
        while (n >= 10) {
            n = sumDigits(n);
        }
        return n;
    }
    public static void main(String[] args) {
        System.out.println(digitalRoot(942));
    }
}
