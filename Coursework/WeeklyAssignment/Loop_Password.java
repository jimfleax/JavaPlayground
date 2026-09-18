package WeeklyAssignment;
import java.util.Scanner;

public class Loop_Password {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        boolean isCorrect = false;
        while (isCorrect == false) {
            System.out.println("Enter your password: ");
            String input = sc.next();
            if (input.equals("1234567890")) {
                isCorrect = true;
                System.out.println("Correct password!");
            } else {
                System.out.println("Oops! Wrong password. Enter again.");
            }
        }
        sc.close();
    }
}