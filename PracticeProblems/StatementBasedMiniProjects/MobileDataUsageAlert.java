import java.util.Scanner;

public class MobileDataUsageAlert {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter total data plan (in GB): ");
        double totalData = sc.nextDouble();
        System.out.print("Enter data used (in GB): ");
        double usedData = sc.nextDouble();

        double remainingData = totalData - usedData;
        
        System.out.println("Remaining data: " + remainingData + " GB");

        if (remainingData <= 0) {
            System.out.println("Data Exhausted");
        } else if (remainingData <= 1) {
            System.out.println("Low Data Alert");
        } else if (usedData > (0.80 * totalData)) {
            System.out.println("High Usage Warning");
        } else {
            System.out.println("Usage Normal");
        }
        sc.close();
    }
}
