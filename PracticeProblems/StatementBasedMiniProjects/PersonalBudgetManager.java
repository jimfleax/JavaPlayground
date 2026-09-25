import java.util.Scanner;

public class PersonalBudgetManager {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter monthly income: ");
        double income = sc.nextDouble();
        System.out.print("Enter expense 1: ");
        double exp1 = sc.nextDouble();
        System.out.print("Enter expense 2: ");
        double exp2 = sc.nextDouble();
        System.out.print("Enter expense 3: ");
        double exp3 = sc.nextDouble();

        double totalExpenses = exp1 + exp2 + exp3;
        double remainingMoney = income - totalExpenses;
        
        int withinBudgetCount = 0;

        System.out.println("Total Expenses: " + totalExpenses);
        System.out.println("Remaining Money: " + remainingMoney);

        if (totalExpenses > income) {
            System.out.println("Budget Exceeded");
            System.out.println("Deficit: " + (totalExpenses - income));
        } else {
            withinBudgetCount++;
            double savingPercentage = (remainingMoney / income) * 100;
            if (savingPercentage >= 30) {
                System.out.println("Excellent Saving");
            } else if (savingPercentage >= 20) {
                System.out.println("Good Saving");
            } else if (savingPercentage >= 10) {
                System.out.println("Average Saving");
            } else {
                System.out.println("Needs Improvement");
            }
        }
        sc.close();
    }
}
