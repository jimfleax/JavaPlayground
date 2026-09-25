public class Q20 {
    public static void main(String[] args) {
        int x = 2;
        if (x++ == 2 && ++x == 4 && x++ == 4) {
            System.out.println("PASS");
        }
        System.out.println(x);
    }
}
