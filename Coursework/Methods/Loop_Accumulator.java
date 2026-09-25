package Methods;

import java.util.Scanner;

public class Loop_Accumulator {
    static int total = 0;

    static int addPrice() {
        Scanner sc = new Scanner(System.in);
        int price = 0;
        while (price != 0) {
            total += price;
        }

        return price;
    }
}
