import java.util.Scanner;

public class CollegeAttendanceRescue {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter attendance percentage: ");
        double attendance = sc.nextDouble();
        System.out.print("Enter total number of assignments: ");
        int totalAssign = sc.nextInt();
        System.out.print("Enter number of assignments completed: ");
        int assignments = sc.nextInt();
        System.out.print("Project submitted (true/false): ");
        boolean projectSubmitted = sc.nextBoolean();

        double assignPercent = ((double) assignments / totalAssign) * 100;

        if (attendance < 75) {
            System.out.println("Extra Classes Required");
        } else {
            if (projectSubmitted && assignPercent >= 80) {
                System.out.println("Enjoy Your Semester");
            } else {
                System.out.println("Complete Your Work First!");
            }
        }
        sc.close();
    }
}
