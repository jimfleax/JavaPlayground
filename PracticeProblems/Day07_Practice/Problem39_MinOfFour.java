public class Problem39_MinOfFour {
    public static int min(int a, int b) {
        return a < b ? a : b;
    }
    public static int minOfFour(int a, int b, int c, int d) {
        return min(min(a, b), min(c, d));
    }
    public static void main(String[] args) {
        System.out.println(minOfFour(5, 2, 8, 1));
    }
}
