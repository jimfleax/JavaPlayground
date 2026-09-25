public class Problem22_IsEvenAndPositive {
    public static boolean isEvenAndPositive(int n) {
        return n > 0 && n % 2 == 0;
    }
    public static void main(String[] args) {
        System.out.println(isEvenAndPositive(4));
    }
}
