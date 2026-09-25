public class Problem24_DifferenceOfMaxAndMin {
    public static int max(int a, int b) { return a > b ? a : b; }
    public static int min(int a, int b) { return a < b ? a : b; }
    
    public static int maxOfThree(int a, int b, int c) {
        return max(max(a, b), c);
    }
    public static int minOfThree(int a, int b, int c) {
        return min(min(a, b), c);
    }
    
    public static int differenceOfMaxAndMin(int a, int b, int c) {
        return maxOfThree(a, b, c) - minOfThree(a, b, c);
    }
    public static void main(String[] args) {
        System.out.println(differenceOfMaxAndMin(5, 1, 9));
    }
}
