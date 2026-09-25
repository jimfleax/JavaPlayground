import java.util.Scanner;

public class OnlineShoppingCheckout {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter product price: ");
        double price = sc.nextDouble();
        System.out.print("Enter quantity: ");
        int quantity = sc.nextInt();
        System.out.print("Premium member (true/false): ");
        boolean isPremium = sc.nextBoolean();
        System.out.print("Enter coupon code: ");
        String coupon = sc.next();

        double subtotal = price * quantity;
        double discount = 0;

        if (subtotal >= 2000) {
            discount += subtotal * 0.10;
        }
        if (isPremium) {
            discount += subtotal * 0.05;
        }

        double totalAfterDiscount = subtotal - discount;
        double finalPayable = totalAfterDiscount;

        if (totalAfterDiscount < 999) {
            finalPayable += 80;
            System.out.println("Delivery charges added: 80");
        } else {
            System.out.println("Free Delivery!");
        }

        System.out.println("Subtotal: " + subtotal);
        System.out.println("Discount: " + discount);
        System.out.println("Final Payable Amount: " + finalPayable);
        sc.close();
    }
}
