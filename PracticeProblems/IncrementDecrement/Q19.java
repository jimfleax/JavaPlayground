public class Q19 {
    public static void main(String[] args) {
        int n = 5;
        if (n-- == 5 && --n == 3) {
            System.out.println("MATCH");
        }
        System.out.println(n);
    }
}
