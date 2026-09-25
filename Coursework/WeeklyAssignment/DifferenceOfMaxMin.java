package WeeklyAssignment;

import java.util.Scanner;

public class DifferenceOfMaxMin {
    static int max(int a, int b, int c) {
        if (a >= b && a >= c) {
            return a;
        } else if (b >= a && b >= c) {
            return b;
        } else {
            return c;
        }
    }

    static int min(int a, int b, int c) {
        if (a <= b && a <= c) {
            return a;
        } else if (b <= a && b <= c) {
            return b;
        } else {
            return c;
        }
    }
    static int differenceOfMaxAndMin(int a, int b, int c) {
        return max(a, b, c) - min(a, b, c);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first number: ");
        int a = sc.nextInt();
        System.out.print("Enter second number: ");
        int b = sc.nextInt();
        System.out.print("Enter third number: ");
        int c = sc.nextInt();
        int difference = differenceOfMaxAndMin(a, b, c);
        System.out.println("The difference between the maximum and minimum values is: " + difference);
    }
}
