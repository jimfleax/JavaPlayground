public class Problem08_MaxOfThree {
    public static int maxOfThree(int a, int b, int c) {
        int max = a > b ? a : b;
        return max > c ? max : c;
    }
    public static void main(String[] args) {
        System.out.println(maxOfThree(4, 7, 2));
    }
}
