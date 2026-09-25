// Day 6 — Pattern Practice
public class Day06PatternProblems {
    public static void main(String[] args) {
        int rows = 4;

        // Square
        for (int r = 1; r <= rows; r++) {
            for (int c = 1; c <= rows; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        // Increasing triangle
        for (int r = 1; r <= rows; r++) {
            for (int c = 1; c <= r; c++) {
                System.out.print("* ");
            }
            System.out.println();
        }

        System.out.println();

        // Number triangle
        for (int r = 1; r <= rows; r++) {
            for (int c = 1; c <= r; c++) {
                System.out.print(c + " ");
            }
            System.out.println();
        }
    }
}
