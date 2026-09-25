import java.util.Scanner;

public class ElectricityBillCalculator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter units consumed: ");
        int units = sc.nextInt();

        double bill = 0;
        
        if (units <= 100) {
            bill = units * 5;
        } else if (units <= 200) {
            bill = (100 * 5) + ((units - 100) * 7);
        } else {
            bill = (100 * 5) + (100 * 7) + ((units - 200) * 10);
        }

        double surcharge = 0;
        if (bill > 2500) {
            surcharge = bill * 0.05;
        }

        double finalBill = bill + surcharge;

        System.out.println("Units consumed: " + units);
        System.out.println("Base bill: " + bill);
        System.out.println("Surcharge: " + surcharge);
        System.out.println("Final bill: " + finalBill);
        sc.close();
    }
}
