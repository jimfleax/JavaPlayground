public class Q29 {
    public static void main(String[] args) {
        int x = 10;
        int y = x-- > 10 ? ++x : x++ + ++x;
        System.out.println(x + " " + y);
    }
}
