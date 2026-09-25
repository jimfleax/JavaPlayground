import java.util.Scanner;

public class CrushCompatibilityChecker {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        System.out.print("Enter Name: ");
        String name = scanner.nextLine();
        
        System.out.print("Enter Age: ");
        int age = scanner.nextInt();
        
        System.out.print("Enter Confidence Level (1-10): ");
        int confidence = scanner.nextInt();
        
        System.out.print("Enter Effort Level (1-10): ");
        int effort = scanner.nextInt();
        
        System.out.print("Enter Number of replies received today: ");
        int replies = scanner.nextInt();
        
        if (age < 18) {
            System.out.println("Focus on studies first!");
        } else {
            int score = 0;
            
            if (confidence >= 7) {
                score++;
            } else {
                System.out.println("Confidence is low.");
            }
            
            if (effort >= 7) {
                score++;
            } else {
                System.out.println("Effort is low.");
            }
            
            if (replies >= 10) {
                score++;
            } else if (replies >= 5 && replies <= 9) {
                score++;
            } else {
                System.out.println("The person is probably being ignored. 😂");
            }
            
            System.out.print("Score " + score + " -> ");
            if (score == 3) {
                System.out.println("\"LEGENDARY MATCH!\"");
            } else if (score == 2) {
                System.out.println("\"GOOD MATCH!\"");
            } else if (score == 1) {
                System.out.println("\"RISKY MATCH!\"");
            } else {
                System.out.println("\"SINGLE MODE!\"");
            }
            
            System.out.println("\n--- Next Move ---");
            System.out.println("1. Send Message");
            System.out.println("2. Wait for Reply");
            System.out.println("3. Move On");
            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            
            switch (choice) {
                case 1:
                    System.out.println("Message sent!");
                    replies++;
                    System.out.println("Replies count is now: " + replies);
                    break;
                case 2:
                    System.out.println("Waiting for reply...");
                    replies--;
                    System.out.println("Patience/Replies count decreased to: " + replies);
                    break;
                case 3:
                    System.out.println("Moving On... Time to focus on yourself!");
                    break;
                default:
                    System.out.println("Invalid choice!");
                    break;
            }
        }
        
        scanner.close();
    }
}
