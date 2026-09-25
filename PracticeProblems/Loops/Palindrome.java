public class Palindrome {
    private String word;
    private boolean palindrome;
    private int index, halfIndex;

    public Palindrome(String s) {
        word = s;
        index = s.length();
        palindrome = true;
        halfIndex = index / 2;
    }

    boolean isPalindrome() {
        for (int i = 0; i < halfIndex && palindrome; i++) {
            if (word.charAt(i) != word.charAt(index - i - 1)) {
                palindrome = false;
            }
        }
        return palindrome;
    }
}
