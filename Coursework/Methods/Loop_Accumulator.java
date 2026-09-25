package Methods;

import java.util.Scanner;

public class Loop_Accumulator {
    static int total = 0;

    static int addPrice() {
        Scanner sc = new Scanner(System.in);
        int price = -1;
        while (price != 0) {
            System.out.print("Enter price (0 to stop): ");
            price = sc.nextInt();
            total += price;
        }
        sc.close();
        return total;
    }

    public static void main(String[] args) {
        int finalTotal = addPrice();
        System.out.println("Total is: " + finalTotal);
    }
}
