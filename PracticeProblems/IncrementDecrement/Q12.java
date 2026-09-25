public class Q12 {
    public static void main(String[] args) {
        int x = 10;
        int y = x++ + 5;
        x = ++y;
        System.out.println(x + " " + y);
    }
}
