public class Problem19_Grade {
    public static String grade(int marks) {
        if (marks >= 90) return "A";
        else if (marks >= 80) return "B";
        else if (marks >= 70) return "C";
        else if (marks >= 60) return "D";
        else return "F";
    }
    public static void main(String[] args) {
        System.out.println(grade(85));
    }
}
