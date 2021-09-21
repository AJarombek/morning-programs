/**
 * https://leetcode.com/problems/valid-palindrome-ii/
 * @author Andrew Jarombek
 * @since 9/21/2021
 */

public class ValidPalindromeII {
    public boolean validPalindrome(String s) {
        int start = 0;
        int end = s.length() - 1;

        while (start < end) {
            if (s.charAt(start) == s.charAt(end)) {
                start++;
                end--;
            } else {
                boolean valid = false;

                if (s.charAt(start) == s.charAt(end - 1)) {
                    valid = valid || validPalindrome(s, start + 1, end - 2);
                }

                if (s.charAt(start + 1) == s.charAt(end)) {
                    valid = valid || validPalindrome(s, start + 2, end - 1);
                }

                return valid;
            }
        }

        return true;
    }

    private boolean validPalindrome(String s, int start, int end) {
        while (start < end) {
            if (s.charAt(start) == s.charAt(end)) {
                start++;
                end--;
            } else {
                return false;
            }
        }

        return true;
    }
}
