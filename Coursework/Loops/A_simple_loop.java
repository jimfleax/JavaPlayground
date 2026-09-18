package Loops;

public class A_simple_loop {
    public static void main(String[] args) {
        System.out.println("Printing numbers from 1 to 20:");
        for (int i = 1; i<=20; i++) {
            System.out.println(i);
        }
        System.out.println("In reverse order:");
        for (int i = 20; i >= 1; i--) {
            System.out.println(i);
        }
        System.out.println("Printing even numbers from 1 to 50:");
        for (int i = 1; i <= 50; i++) {
            if (i % 2 == 0) {
                System.out.println(i);
            }
        }
        System.out.println("Printing odd numbers from 1 to 50:");
        for (int i = 1; i <= 50; i++) {
            if (i % 2 != 0) {
                System.out.println(i);
            }
        }
        System.out.println("Printing non-multiples of 5 from 1 to 50:");
        for (int i = 1; i <= 50; i++) {
            if (i % 5 != 0) {
                System.out.println(i);
            }
        }
    }
}
