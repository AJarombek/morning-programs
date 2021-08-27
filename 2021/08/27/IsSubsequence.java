/**
 * https://leetcode.com/problems/is-subsequence/
 * @author Andrew Jarombek
 * @since 8/27/2021
 */

public class IsSubsequence {
    public static boolean isSubsequence(String s, String t) {
        if (s.length() == 0) {
            return true;
        }

        if (t.length() < s.length()) {
            return false;
        }

        int index = 0;
        char currentChar = s.charAt(index);

        for (int i = 0; i < t.length(); i++) {
            if (t.charAt(i) == currentChar) {
                index++;

                if (index == s.length()) {
                    return true;
                } else {
                    currentChar = s.charAt(index);
                }
            }
        }

        return false;
    }
}
