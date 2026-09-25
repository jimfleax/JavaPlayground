import java.util.Scanner;

public class GCDLCM {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter first positive integer: ");
        int a = sc.nextInt();
        System.out.print("Enter second positive integer: ");
        int b = sc.nextInt();
        
        int aTemp = a;
        int bTemp = b;
        
        // Find GCD using the Euclidean algorithm (without library methods)
        while (bTemp != 0) {
            int temp = bTemp;
            bTemp = aTemp % bTemp;
            aTemp = temp;
        }
        int gcd = aTemp;
        
        // Find LCM using the formula: LCM(a, b) = (a * b) / GCD(a, b)
        int lcm = (a * b) / gcd;
        
        System.out.println("GCD: " + gcd);
        System.out.println("LCM: " + lcm);
        
        sc.close();
    }
}
