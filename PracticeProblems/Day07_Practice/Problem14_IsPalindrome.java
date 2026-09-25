public class Problem14_IsPalindrome {
    public static boolean isPalindrome(int n) {
        return n == reverseNumber(n);
    }
    public static int reverseNumber(int n) {
        int rev = 0;
        int temp = n;
        while (temp != 0) {
            rev = rev * 10 + temp % 10;
            temp /= 10;
        }
        return rev;
    }
    public static void main(String[] args) {
        System.out.println(isPalindrome(121));
    }
}
