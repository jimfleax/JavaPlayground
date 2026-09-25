public class Problem20_Absolute {
    public static int absolute(int n) {
        return n < 0 ? -n : n;
    }
    public static void main(String[] args) {
        System.out.println(absolute(-5));
    }
}
