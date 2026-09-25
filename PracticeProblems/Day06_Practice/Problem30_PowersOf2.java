import java.util.Scanner;
public class Problem30_PowersOf2 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter N: ");
        int n = sc.nextInt();
        int p = 1;
        while (p <= n) {
            System.out.println(p);
            p *= 2;
        }
    }
}
