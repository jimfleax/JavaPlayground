public class Q26 {
    public static void main(String[] args) {
        int x = 4;
        int y = (x++ > 4) ? ++x : x--;
        System.out.println(x + " " + y);
    }
}
