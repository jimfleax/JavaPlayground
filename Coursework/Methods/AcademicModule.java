package Methods;

public class AcademicModule {
    int attendedClasses;
    int totalClasses;
    int threeSubjectMarks;

    static double calculateAttendance(int attended, int total) {
        return ((double) attended / total) * 100;
    }

    static double calculateAverage(int m1, int m2, int m3) {
        return (m1 + m2 + m3)/3;
    }

    static boolean checkEligibility(double attendance, double average) {
        return (attendance >= 75 && average >= 40);
    }

    static void printAcademicResults(int attended, int total, int m1, int m2, int m3) {
        double attendance = calculateAttendance(attended, total);
        double average = calculateAverage(m1, m2, m3);
        boolean eligible = checkEligibility(attendance, average);

        System.out.println("Attendance: " + attendance + "%");
        System.out.println("Average Marks: " + average);
        System.out.println("Eligibility for exams: " + (eligible ? "Eligible" : "Not Eligible"));
    }

    public static void main(String[] args) {
        System.out.println("Attendance: " + AcademicModule.calculateAttendance(50, 70));
        System.out.println("Average Marks: " + AcademicModule.calculateAverage(70, 80, 90));
        System.out.println("Eligibility: " + AcademicModule.checkEligibility(80, 85));
        AcademicModule.printAcademicResults(50, 70, 70, 80, 90);
    }
}