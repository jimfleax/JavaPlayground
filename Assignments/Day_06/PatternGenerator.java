import java.util.Scanner;

public class PatternGenerator {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter rows R: ");
        int r = sc.nextInt();
        
        // Star pattern
        System.out.println("Star Pattern:");
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }
        
        System.out.println();
        
        // Number pattern
        System.out.println("Number Pattern:");
        for (int i = 1; i <= r; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(j + " ");
            }
            System.out.println();
        }
        
        sc.close();
    }
}
