import java.util.Scanner;

public class StudentResultSystem {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter Student Name: ");
        String name = sc.nextLine();
        System.out.print("Enter marks for Subject 1: ");
        double m1 = sc.nextDouble();
        System.out.print("Enter marks for Subject 2: ");
        double m2 = sc.nextDouble();
        System.out.print("Enter marks for Subject 3: ");
        double m3 = sc.nextDouble();
        System.out.print("Enter attendance percentage: ");
        double attendance = sc.nextDouble();

        double total = m1 + m2 + m3;
        double percentage = (total / 300) * 100;

        System.out.println("Total Marks: " + total);
        System.out.println("Percentage: " + percentage + "%");

        if (percentage < 40) {
            System.out.println("Grade: Fail");
        } else if (percentage >= 90) {
            System.out.println("Grade: A");
        } else if (percentage >= 75) {
            System.out.println("Grade: B");
        } else if (percentage >= 60) {
            System.out.println("Grade: C");
        } else {
            System.out.println("Grade: D");
        }

        if (attendance >= 80 && percentage >= 75) {
            System.out.println("Scholarship Eligible");
        } else {
            System.out.println("No Scholarship");
        }
        sc.close();
    }
}
