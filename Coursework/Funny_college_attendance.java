import java.util.Scanner;

public class Funny_college_attendance {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Enter your attendance percentage: ");
        int attendance = input.nextInt();
        System.out.println("Number of assignments submitted: ");
        int assignmentsSubmitted = input.nextInt();
        System.out.println("Project has been submitted? (true/false): ");
        boolean projectSubmitted = input.nextBoolean();

        final int attendanceThreshold = 75;
        final int assignmentThreshold = 80;

        if (attendance < attendanceThreshold) {
            System.out.println("Extra classes are required!");
        } else if (projectSubmitted && assignmentsSubmitted >= assignmentThreshold) {
            System.out.println("Enjoy your semester!");
        } else {
            System.out.println("Complete your work first!");
        }
        input.close();
    }
}