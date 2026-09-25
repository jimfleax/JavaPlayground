public class Q34 {
    public static void main(String[] args) {
        int n = 5;
        int result = n++ + (n > 5 ? ++n : n--) + --n;
        System.out.println(n + " " + result);
    }
}
