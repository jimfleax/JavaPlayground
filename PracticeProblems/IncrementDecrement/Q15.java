public class Q15 {
    public static void main(String[] args) {
        int p = 5;
        int q = 10;
        int r = p++ + q;
        p = ++r;
        System.out.println(p + " " + q + " " + r);
    }
}
