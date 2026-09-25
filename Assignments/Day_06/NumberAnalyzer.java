import java.util.Scanner;

public class NumberAnalyzer {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a positive integer N: ");
        int n = sc.nextInt();
        
        int temp = n;
        int count = 0;
        int sum = 0;
        int largest = 0;
        int reverse = 0;
        
        while (temp > 0) {
            int digit = temp % 10;
            
            // Number of digits
            count++;
            
            // Sum of digits
            sum += digit;
            
            // Largest digit
            if (digit > largest) {
                largest = digit;
            }
            
            // Reverse of N
            reverse = (reverse * 10) + digit;
            
            temp /= 10;
        }
        
        System.out.println("Number of digits: " + count);
        System.out.println("Sum of digits: " + sum);
        System.out.println("Largest digit: " + largest);
        System.out.println("Reverse of N: " + reverse);
        
        // Check palindrome
        if (n == reverse) {
            System.out.println("Palindrome: Yes");
        } else {
            System.out.println("Palindrome: No");
        }
        
        sc.close();
    }
}
