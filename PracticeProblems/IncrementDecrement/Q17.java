public class Q17 {
    public static void main(String[] args) {
        int x = 5;
        if (++x == 6 || x++ == 7) {
            System.out.println("TRUE");
        }
        System.out.println(x);
    }
}
