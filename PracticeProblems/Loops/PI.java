import java.text.NumberFormat;
import java.text.DecimalFormat;

public class PI {
    static final double MARGIN_OF_ERROR = 0.05;
    double sum;
    int iterate;

    public PI() {
        sum = 1;
    }

    public double findXnew(int n) {
        return Math.pow(-1.0, n) / (2 * n + 1);
    }

    public void findPi() {
        int i = 1;
        double xold = 2.0; // Choose a value
        double xnew = findXnew(i);

        while (Math.abs(xnew - xold) > MARGIN_OF_ERROR) {
            sum = sum + xnew;
            xold = xnew;
            i++;
            xnew = findXnew(i);
        }
        iterate = i;
    }

    public String toString() {
        NumberFormat nf = NumberFormat.getInstance();
        DecimalFormat df = (DecimalFormat) nf;
        df.applyPattern("0.00000000");
        return "The approximate value of pi is " + df.format((4 * sum)) + "\n"
                + "The number of iterations is " + iterate;
    }
}
