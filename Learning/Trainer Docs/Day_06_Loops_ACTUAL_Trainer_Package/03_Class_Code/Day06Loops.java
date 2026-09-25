// Day 6 — Live Coding Master
// Topic: for, while, do-while, break, continue

public class Day06Loops {
    public static void main(String[] args) {

        // 1. for loop
        System.out.println("1) for loop");
        for (int i = 1; i <= 5; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // 2. while loop
        System.out.println("2) while loop");
        int x = 1;
        while (x <= 5) {
            System.out.print(x + " ");
            x++;
        }
        System.out.println();

        // 3. do-while: executes at least once
        System.out.println("3) do-while");
        int y = 10;
        do {
            System.out.println("Body executed once");
            y++;
        } while (y <= 5);

        // 4. break
        System.out.println("4) break");
        for (int i = 1; i <= 10; i++) {
            if (i == 6) {
                break;
            }
            System.out.print(i + " ");
        }
        System.out.println();

        // 5. continue
        System.out.println("5) continue");
        for (int i = 1; i <= 5; i++) {
            if (i == 3) {
                continue;
            }
            System.out.print(i + " ");
        }
        System.out.println();

        // 6. accumulator
        int n = 5;
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            sum += i;
        }
        System.out.println("Sum 1..5 = " + sum);

        // 7. digit processing
        int number = 5724;
        int reverse = 0;

        while (number > 0) {
            int digit = number % 10;
            reverse = reverse * 10 + digit;
            number /= 10;
        }

        System.out.println("Reverse = " + reverse);
    }
}
