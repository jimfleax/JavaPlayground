public class ReverseNumber {
    private int n;
    private String s;

    public ReverseNumber(int n) {
        this.n = n;
        s = "";
    }

    void reverse() {
        while (n > 0) {
            s = s + n % 10;
            n = n / 10;
        }
    }

    public String toString() {
        return s;
    }
}
