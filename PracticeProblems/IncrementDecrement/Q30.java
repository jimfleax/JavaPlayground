public class Q30 {
    public static void main(String[] args) {
        int p = 2;
        int q = (p++ > 2) ? ++p : p++ + 5;
        System.out.println(p + " " + q);
    }
}
