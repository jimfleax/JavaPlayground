public class Q35 {
    public static void main(String[] args) {
        int x = 3;
        if (x++ == 3 && x++ == 4 || ++x == 6) {
            System.out.println("JAVA");
        }
        System.out.println(x);
    }
}
