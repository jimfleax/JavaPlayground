public class Problem21_SumOfSquares {
    public static int square(int n) {
        return n * n;
    }
    public static int sumOfSquares(int a, int b) {
        return square(a) + square(b);
    }
    public static void main(String[] args) {
        System.out.println(sumOfSquares(3, 4));
    }
}
