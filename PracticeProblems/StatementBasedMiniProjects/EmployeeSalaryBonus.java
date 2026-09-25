import java.util.Scanner;

public class EmployeeSalaryBonus {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter basic salary: ");
        double salary = sc.nextDouble();
        System.out.print("Enter years of experience: ");
        int experience = sc.nextInt();
        System.out.print("Enter performance rating (1-5): ");
        int rating = sc.nextInt();

        double bonus = 0;
        if (rating == 5) {
            bonus = salary * 0.20;
        } else if (rating == 4) {
            bonus = salary * 0.10;
        } else if (rating == 3) {
            bonus = salary * 0.05;
        }

        double finalSalary = salary + bonus;

        if (experience > 5) {
            finalSalary += 2000;
        }

        System.out.println("Final Salary: " + finalSalary);
        if (finalSalary > 50000) {
            System.out.println("Senior Compensation Band");
        } else {
            System.out.println("Standard Compensation Band");
        }
        sc.close();
    }
}
