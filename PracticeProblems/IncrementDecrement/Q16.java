public class Q16 {
    public static void main(String[] args) {
        int x = 5;
        if (x++ > 5 && ++x > 6) {
            System.out.println("YES");
        }
        System.out.println(x);
    }
}
