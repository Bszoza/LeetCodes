package problems;

public class PalindromeNumber {
    public boolean isPalindrome(int x) {
        String palindrome = String.valueOf(x);
        for (int i = 0; i <= palindrome.length() / 2; i++) {
            if (palindrome.charAt(i) != palindrome.charAt(palindrome.length() - i - 1)) {
                return false;
            }
        }
        return true;
    }
}
