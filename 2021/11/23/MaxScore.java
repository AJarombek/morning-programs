/**
 * https://leetcode.com/problems/maximum-score-after-splitting-a-string/
 * @author Andrew Jarombek
 * @since 11/23/2021
 */

public class MaxScore {
    public int maxScore(String s) {
        int left = 0;
        int right = 0;
        int result = 0;

        for (char c : s.toCharArray()) {
            if (c == '1') {
                right++;
            }
        }

        for (int i = 0; i < s.length() - 1; i++) {
            if (s.charAt(i) == '1') {
                right--;
            } else {
                left++;
            }

            result = Math.max(result, left + right);
        }

        return result;
    }
}
