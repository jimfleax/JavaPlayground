import java.util.Scanner;

public class StudentSurvivalSystem {

    // --- Phase 1: Academic Module ---
    static double calculateAttendance(int attended, int total) {
        if (total == 0) return 0.0;
        return (attended * 100.0) / total;
    }

    static double calculateAverage(int a, int b, int c) {
        return (a + b + c) / 3.0;
    }

    static boolean checkEligibility(double attendance, double average) {
        return attendance >= 75 && average >= 40;
    }

    // --- Phase 2: Love Life Compatibility ---
    static int calculateCompatibility(int patience, int replyTime, int budget, int arguments) {
        int score = 50;
        if (patience >= 7) score += 15;
        if (replyTime <= 30) score += 15;
        if (budget >= 2000) score += 10;
        if (arguments <= 3) score += 10;
        return score;
    }

    static String relationshipStatus(int score) {
        if (score >= 75) return "Relationship Material ❤■";
        else if (score >= 50) return "Warning: Arguments thode kam karo ■";
        else return "Single is better ■";
    }

    static void printRelationshipResult(int score, String status) {
        System.out.println("Compatibility Score: " + score + " — " + status);
    }

    // --- Phase 3: Money Survival ---
    static int calculateExpenses(int rent, int food, int travel, int recharge, int entertainment) {
        return rent + food + travel + recharge + entertainment;
    }

    static int calculateSavings(int income, int expenses) {
        return income - expenses;
    }

    static boolean checkBudget(int savings) {
        return savings >= 0;
    }

    static void printBudgetResult(int income, int expenses, int savings) {
        System.out.println("Total Income: " + income);
        System.out.println("Total Expenses: " + expenses);
        if (savings < 0) {
            System.out.println("Bhai, salary se pehle expenses aa gaye ■");
        } else if (savings == 0) {
            System.out.println("Balance: Zen mode ■");
        } else if (savings > 5000) {
            System.out.println("Future CEO detected ■");
        } else {
            System.out.println("Savings: " + savings);
        }
    }

    // --- Final Challenge: Study Score ---
    static int calculateStudyScore(int studyHours) {
        if (studyHours >= 40) return 25;
        if (studyHours >= 20) return 15;
        return 5;
    }

    // --- Phase 5: Method Composition ---
    static int calculateLifeScore(double attendance, double average, int compatibility, int savings, int studyScore) {
        int score = 0;
        if (attendance >= 75) score += 20; 
        if (average >= 60) score += 20;
        if (compatibility >= 70) score += 20;
        if (savings >= 5000) score += 20;
        score += studyScore; 
        return score;
    }

    static String getFinalStatus(int score) {
        if (score >= 75) return "Survival Master ■";
        else if (score >= 50) return "Needs Improvement ■";
        else return "Save Yourself First ■";
    }

    // --- Phase 6: Method Overloading ---
    static void printReport(int score, String status) {
        System.out.println("===== FINAL SURVIVAL REPORT =====");
        System.out.println("Life Score: " + score);
        System.out.println("Status: " + status);
    }

    // Overloaded printReport
    static void printReport() {
        System.out.println("=================================");
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("--- Academic Module ---");
        System.out.print("Enter attended classes: ");
        int attended = sc.nextInt();
        System.out.print("Enter total classes: ");
        int totalClasses = sc.nextInt();
        System.out.print("Enter marks for Subject 1: ");
        int m1 = sc.nextInt();
        System.out.print("Enter marks for Subject 2: ");
        int m2 = sc.nextInt();
        System.out.print("Enter marks for Subject 3: ");
        int m3 = sc.nextInt();

        double attendance = calculateAttendance(attended, totalClasses);
        double avg = calculateAverage(m1, m2, m3);
        boolean eligible = checkEligibility(attendance, avg);
        System.out.println("Attendance: " + attendance + "%, Average: " + avg + ", Eligible: " + eligible);

        System.out.println("\n--- Love Life Compatibility ---");
        System.out.print("Patience level (1-10): ");
        int patience = sc.nextInt();
        System.out.print("Reply time (minutes): ");
        int replyTime = sc.nextInt();
        System.out.print("Monthly relationship budget: ");
        int relBudget = sc.nextInt();
        System.out.print("Number of arguments per month: ");
        int argsCount = sc.nextInt();

        int compScore = calculateCompatibility(patience, replyTime, relBudget, argsCount);
        String compStatus = relationshipStatus(compScore);
        printRelationshipResult(compScore, compStatus);

        System.out.println("\n--- Money Survival ---");
        System.out.print("Enter Income: ");
        int income = sc.nextInt();
        System.out.print("Enter Rent: ");
        int rent = sc.nextInt();
        System.out.print("Enter Travel cost: ");
        int travel = sc.nextInt();
        System.out.print("Enter Recharge cost: ");
        int recharge = sc.nextInt();
        System.out.print("Enter Entertainment cost: ");
        int entertainment = sc.nextInt();

        System.out.println("\n--- Phase 4: Loop Challenge (Food Items) ---");
        System.out.println("Enter food-item prices repeatedly. Enter 0 to stop.");
        int totalFood = 0;
        while (true) {
            System.out.print("Food price (0 to stop): ");
            int price = sc.nextInt();
            if (price == 0) break;
            totalFood = totalFood + price;
        }

        int totalExpenses = calculateExpenses(rent, totalFood, travel, recharge, entertainment);
        int savings = calculateSavings(income, totalExpenses);
        printBudgetResult(income, totalExpenses, savings);

        System.out.println("\n--- Final Challenge ---");
        System.out.print("Enter study hours per month: ");
        int studyHours = sc.nextInt();
        int studyScore = calculateStudyScore(studyHours);

        System.out.println("\nGenerating Final Report...");
        int lifeScore = calculateLifeScore(attendance, avg, compScore, savings, studyScore);
        String finalStatus = getFinalStatus(lifeScore);
        printReport(lifeScore, finalStatus);
        printReport();

        sc.close();
    }
}
