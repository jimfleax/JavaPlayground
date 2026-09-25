public class Q7 {
    public static void main(String[] args) {
        int x = 6;
        int y = 2;
        int z = x++ * ++y + --x;
        System.out.println(x + " " + y + " " + z);
    }
}
