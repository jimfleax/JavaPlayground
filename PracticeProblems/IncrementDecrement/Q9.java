public class Q9 {
    public static void main(String[] args) {
        int p = 2;
        int q = 3;
        int r = p++ + q++ * ++p;
        System.out.println(p + " " + q + " " + r);
    }
}
