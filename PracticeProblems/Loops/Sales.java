import java.util.Scanner;
import java.text.NumberFormat;

public class Sales {
    private double totalSales;
    private static final int DAYS = 7;
    private static final char STORES = 'E';
    private String header;
    private String s;
    private static final NumberFormat nf = NumberFormat.getCurrencyInstance();

    public Sales() {
        totalSales = 0;
        s = "";
        header = "Store\t\t\tDay\n\t1\t2\t3\t4\t5\t6\t7\tTotal\n";
    }

    public void calculateSales() {
        Scanner scanner = new Scanner(System.in);
        char store = 'A';
        while (store <= STORES) {
            s = s + store + " - ";
            int day = 1;
            totalSales = 0;
            while (day <= DAYS) {
                System.out.println("Store " + store + "\nDay " + day + "\nEnter amount:");
                double amount = scanner.nextDouble();
                s = s + "\t" + nf.format(amount);
                day++;
                totalSales = totalSales + amount;
            }
            s = s + "\t" + nf.format(totalSales) + "\n";
            store++;
        }
    }

    public String toString() {
        return header + s;
    }
}
