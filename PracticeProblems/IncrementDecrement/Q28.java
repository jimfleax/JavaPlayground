public class Q28 {
    public static void main(String[] args) {
        int n = 3;
        int result = (n++ == 3) ? n++ + ++n : --n;
        System.out.println(n + " " + result);
    }
}
