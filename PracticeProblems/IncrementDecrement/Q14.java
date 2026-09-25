public class Q14 {
    public static void main(String[] args) {
        int x = 3;
        int y = 7;
        x += y++;
        y = ++x;
        System.out.println(x + " " + y);
    }
}
