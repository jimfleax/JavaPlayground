import java.util.Scanner;

public class StudentResultUtility {
    
    public static int total(int m1, int m2, int m3, int m4, int m5) {
        return m1 + m2 + m3 + m4 + m5;
    }
    
    public static double percentage(int totalMarks) {
        // Assuming each subject is out of 100, so max total is 500
        return (totalMarks / 500.0) * 100;
    }
    
    public static char grade(double percentage) {
        if (percentage >= 90) {
            return 'A';
        } else if (percentage >= 80) {
            return 'B';
        } else if (percentage >= 70) {
            return 'C';
        } else if (percentage >= 60) {
            return 'D';
        } else {
            return 'F';
        }
    }
    
    public static boolean isPass(double percentage) {
        return percentage >= 40;
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter marks for 5 subjects:");
        int m1 = sc.nextInt();
        int m2 = sc.nextInt();
        int m3 = sc.nextInt();
        int m4 = sc.nextInt();
        int m5 = sc.nextInt();
        
        int totalMarks = total(m1, m2, m3, m4, m5);
        double perc = percentage(totalMarks);
        
        System.out.println("Total Marks: " + totalMarks);
        System.out.println("Percentage: " + perc + "%");
        System.out.println("Grade: " + grade(perc));
        System.out.println("Pass: " + (isPass(perc) ? "Yes" : "No"));
        
        sc.close();
    }
}
