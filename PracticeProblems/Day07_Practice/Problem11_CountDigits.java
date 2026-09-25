public class Problem11_CountDigits {
    public static int countDigits(int n) {
        int count = 0;
        n = Math.abs(n);
        while (n > 0) {
            count++;
            n /= 10;
        }
        return count == 0 ? 1 : count;
    }
    public static void main(String[] args) {
        System.out.println(countDigits(123));
    }
}
