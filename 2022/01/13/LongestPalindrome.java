/**
 * https://leetcode.com/problems/longest-palindromic-substring/
 * @author Andrew Jarombek
 * @since 1/13/2022
 */

public class LongestPalindrome {
    public String longestPalindrome(String s) {
        String longest = s.substring(0, 1);

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            for (int j = i + longest.length(); j < s.length(); j++) {
                if (s.charAt(j) == c) {
                    String forward = s.substring(i, j + 1);
                    String backward = (new StringBuilder(forward)).reverse().toString();

                    if (forward.equals(backward)) {
                        longest = forward;
                    }
                }
            }
        }

        return longest;
    }
}
