public class LoopControl {
    public static void main(String[] args) {
        for (int i = 1; i <= 100; i++) {
            // Stop completely when a number divisible by 73 is reached
            if (i % 73 == 0) {
                break;
            }
            
            // Skip multiples of 4
            if (i % 4 == 0) {
                continue;
            }
            
            System.out.print(i + " ");
        }
        System.out.println();
    }
}
