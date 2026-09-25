package Methods;

public class LoveLifeCompatibility {
    static int calculateCompatibility(int patience, int replyTime, int budget, int arguments) {
        return (patience + replyTime + budget + arguments) / 4;
    }
    static String relationshipStatus(int score) {
        if (score >= 75) {
            return "Strong Relationship";
        } else if (score >= 50) {
            return "Moderate Relationship";
        } else {
            return "Weak Relationship";
        }
    }
    static void printRelationshipResult(int score, String status) {
        System.out.println("Compatibility Score: " + score);
        System.out.println("Relationship Status: " + status);
    }
    public static void main(String[] args) {
        int score = LoveLifeCompatibility.calculateCompatibility(80, 70, 60, 50);
        String status = LoveLifeCompatibility.relationshipStatus(score);
        LoveLifeCompatibility.printRelationshipResult(score, status);
    }
}
