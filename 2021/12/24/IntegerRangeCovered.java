/**
 * https://leetcode.com/problems/check-if-all-the-integers-in-a-range-are-covered/
 * @author Andrew Jarombek
 * @since 12/24/2021
 */

public class IntegerRangeCovered {
    public boolean isCovered(int[][] ranges, int left, int right) {
        int[] values = new int[51];

        for (int[] range : ranges) {
            for (int i = range[0]; i <= range[1]; i++) {
                values[i] = 1;
            }
        }

        for (int i = left; i <= right; i++) {
            if (values[i] == 0) {
                return false;
            }
        }

        return true;
    }
}
