/**
 * https://leetcode.com/problems/di-string-match/
 * @author Andrew Jarombek
 * @since 10/20/2021
 */

public class DIStringMatch {
    public int[] diStringMatch(String s) {
        int[] result = new int[s.length() + 1];
        char[] chars = s.toCharArray();

        int high = s.length();
        int low = 0;

        for (int i = 0; i < chars.length; i++) {
            if (chars[i] == 'I') {
                result[i] = low;
                low++;
            } else {
                result[i] = high;
                high--;
            }
        }

        result[s.length()] = low;
        return result;
    }
}
