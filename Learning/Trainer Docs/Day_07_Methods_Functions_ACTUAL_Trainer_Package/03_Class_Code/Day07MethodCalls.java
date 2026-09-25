public class Day07MethodCalls {
    static int increment(int x) { return x + 1; }
    static int doubleValue(int x) { return x * 2; }
    static int pipeline(int x) {
        return doubleValue(increment(x));
    }

    static void change(int x) {
        x = 100;
    }

    public static void main(String[] args) {
        System.out.println(pipeline(4)); // 10
        int a = 10;
        change(a);
        System.out.println(a); // 10
    }
}
