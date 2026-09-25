import java.util.Scanner;

public class FoodDeliveryOrder {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter food price: ");
        double price = sc.nextDouble();
        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();
        System.out.print("Enter distance in km: ");
        double distance = sc.nextDouble();
        System.out.print("Membership (true/false): ");
        boolean isMember = sc.nextBoolean();

        double total = price * quantity;
        double finalAmount = total;

        if (total < 500) {
            finalAmount += 50;
        }
        
        if (isMember && total >= 1000) {
            finalAmount -= 100;
        }

        if (distance > 10) {
            finalAmount += 30;
        }

        System.out.println("Food Total: " + total);
        System.out.println("Final Amount: " + finalAmount);
        sc.close();
    }
}
