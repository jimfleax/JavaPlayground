import java.util.Scanner;

public class Grading_System {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int score = input.nextInt();
        if (score >= 90) {
            System.out.println("Grade: A+");
        } else if (score < 90 && score >= 80) {
            System.out.println("Grade: A");
        } else if (score < 80 && score >= 75) {
            System.out.println("Grade: A-");
        } else if (score < 75 && score >= 70) {
            System.out.println("Grade: B+");
        } else if (score < 70 && score >= 65) {
            System.out.println("Grade: B");
        } else if (score < 65 && score >= 60) {
            System.out.println("Grade: B-");
        } else if (score < 60 && score >= 55) {
            System.out.println("Grade: C+");
        } else if (score < 55 && score >= 50) {
            System.out.println("Grade: C");
        } else if (score < 50 && score >= 47) {
            System.out.println("Grade: C-");
        } else if (score < 47 && score >= 45) {
            System.out.println("Grade: D+");
        } else if (score < 45 && score >= 40) {
            System.out.println("Grade: D");
        } else if (score < 40 && score >= 35) {
            System.out.println("Grade: D-");
        } else {
            System.out.println("Grade: F");
        }
    }
}
