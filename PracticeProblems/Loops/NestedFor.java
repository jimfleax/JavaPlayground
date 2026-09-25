import java.util.Scanner;

public class NestedFor {
    public static void main(String[] args) {
        System.out.println("Enter number for time table");
        Scanner read = new Scanner(System.in);
        int n = read.nextInt();
        TimeTable t = new TimeTable(n);
        t.makeTable();
        System.out.println(t);
    }
}
