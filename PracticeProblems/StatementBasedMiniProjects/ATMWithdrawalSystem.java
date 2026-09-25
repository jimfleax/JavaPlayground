import java.util.Scanner;

public class ATMWithdrawalSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int correctPin = 1234;
        
        System.out.print("Enter current balance: ");
        double balance = sc.nextDouble();
        System.out.print("Enter PIN: ");
        int pin = sc.nextInt();
        System.out.print("Enter withdrawal amount: ");
        double withdrawal = sc.nextDouble();

        if (pin == correctPin) {
            if (withdrawal > 0 && withdrawal <= balance) {
                balance -= withdrawal;
                System.out.println("Withdrawal successful. Remaining balance: " + balance);
                if (balance < 1000) {
                    System.out.println("Warning: Low balance!");
                }
            } else {
                System.out.println("Invalid withdrawal amount.");
            }
        } else {
            System.out.println("Invalid PIN.");
        }
        sc.close();
    }
}
