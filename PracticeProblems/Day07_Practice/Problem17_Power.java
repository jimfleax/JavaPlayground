public class Problem17_Power {
    public static long power(int a, int b) {
        long result = 1;
        for (int i = 1; i <= b; i++) {
            result *= a;
        }
        return result;
    }
    public static void main(String[] args) {
        System.out.println(power(2, 3));
    }
}
