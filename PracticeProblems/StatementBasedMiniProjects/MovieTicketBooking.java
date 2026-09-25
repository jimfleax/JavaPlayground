import java.util.Scanner;

public class MovieTicketBooking {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter age: ");
        int age = sc.nextInt();
        System.out.print("Enter number of tickets: ");
        int tickets = sc.nextInt();
        System.out.print("Enter ticket price: ");
        double price = sc.nextDouble();

        double originalTotal = tickets * price;
        double discountPercentage = 0;

        if (age < 12) {
            discountPercentage = 0.30;
        } else if (age >= 60) {
            discountPercentage = 0.20;
        }

        double discountAmount = originalTotal * discountPercentage;

        if (tickets >= 5) {
            discountAmount += 100;
        }

        double finalAmount = originalTotal - discountAmount;

        System.out.println("Original Total: " + originalTotal);
        System.out.println("Discount Amount: " + discountAmount);
        System.out.println("Final Amount: " + finalAmount);
        sc.close();
    }
}
