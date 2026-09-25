public class Q33 {
    public static void main(String[] args) {
        int x = 1;
        int y = 2;
        int z = ++x + y++ + x++ + ++y;
        System.out.println(x + " " + y + " " + z);
    }
}
