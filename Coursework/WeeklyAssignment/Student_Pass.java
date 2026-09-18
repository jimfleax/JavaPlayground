package WeeklyAssignment;
import java.util.Scanner;

public class Student_Pass {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter your marks: ");
        float marks = sc.nextFloat();
        System.out.println("Enter your attendance: ");
        float attendance = sc.nextFloat();

        if (marks > 40 && attendance >= 75) {
            System.out.println("You have passed!");
        } else {
            System.out.println("You have failed!");
        }
        sc.close();
    }
}