public class Q27 {
    public static void main(String[] args) {
        int a = 5;
        int b = ++a > 5 ? a++ : --a;
        System.out.println(a + " " + b);
    }
}
