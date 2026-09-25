// Day 6 — Bug Hunt
// Ask students to find the bugs before showing the fixes.

public class Day06BuggyCode {
    public static void main(String[] args) {

        // Bug 1: wrong boundary can skip n
        int n = 5;
        for (int i = 1; i < n; i++) {
            System.out.print(i + " ");
        }
        System.out.println();

        // Bug 2: state never changes
        int i = 1;
        while (i <= 3) {
            System.out.println(i);
            // missing i++
        }

        // Bug 3: accidental semicolon
        for (int j = 1; j <= 3; j++);
        {
            System.out.println("Hello");
        }

        // Bug 4: continue changes what gets executed
        for (int k = 1; k <= 5; k++) {
            if (k % 2 == 0) {
                continue;
            }
            System.out.println("k = " + k);
        }
    }
}
