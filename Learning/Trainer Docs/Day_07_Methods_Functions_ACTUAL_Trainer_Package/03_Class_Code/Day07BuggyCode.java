public class Day07BuggyCode {
    static int square(int n) {
        System.out.println(n * n);
        // Bug: method says int but returns nothing.
    }

    static void add(int a, int b) {
        return a + b;
        // Bug: void cannot return a value.
    }

    static int max(int a, int b) {
        if (a > b) return a;
        // Bug: missing return path when a <= b.
    }

    public static void main(String[] args) {
        System.out.println(square(5));
    }
}
