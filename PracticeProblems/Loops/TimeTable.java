public class TimeTable {
    int n;
    String s;

    public TimeTable(int n) {
        this.n = n;
        s = "\n x";
    }

    void makeTable() {
        for (int i = 1; i <= n; i++) {
            s = s + "\t" + i;
        }
        s = s + "\n";
        for (int row = 1; row <= 12; row++) {
            s = s + row;
            for (int col = 1; col <= n; col++) {
                s = s + "\t" + (row * col);
            }
            s = s + "\n";
        }
    }

    public String toString() {
        return s;
    }
}
