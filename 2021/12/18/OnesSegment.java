/**
 * https://leetcode.com/problems/check-if-binary-string-has-at-most-one-segment-of-ones/
 * @author Andrew Jarombek
 * @since 12/18/2021
 */

public class OnesSegment {
    public boolean checkOnesSegment(String s) {
        boolean priorZero = false;

        for (char c : s.toCharArray()) {
            if (c == '1' && priorZero) {
                return false;
            } else if (c == '0') {
                priorZero = true;
            }
        }

        return true;
    }
}
