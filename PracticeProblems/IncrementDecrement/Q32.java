public class Q32 {
    public static void main(String[] args) {
        int a = 2;
        int b = 3;
        int c = a++ + ++b * a++ - --b;
        System.out.println(a + " " + b + " " + c);
    }
}
