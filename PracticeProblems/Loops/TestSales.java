import javax.swing.JOptionPane;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class TestSales {
    public static void main(String[] args) {
        Sales s = new Sales();
        s.calculateSales();
        JTextArea t = new JTextArea(s.toString(), 8, 50);
        JScrollPane p = new JScrollPane(t);
        JOptionPane.showMessageDialog(null, p, "Weekly Sales", JOptionPane.INFORMATION_MESSAGE);
    }
}
