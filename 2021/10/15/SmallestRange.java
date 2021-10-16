/**
 * https://leetcode.com/problems/smallest-range-i/
 * @author Andrew Jarombek
 * @since 10/15/2021
 */

public class SmallestRange {
    public int smallestRangeI(int[] nums, int k) {
        int max = nums[0];
        int min = nums[0];

        for (int i = 1; i < nums.length; i++) {
            int val = nums[i];

            if (val < min) {
                min = val;
            }

            if (val > max) {
                max = val;
            }
        }

        return Math.max(0, max - min - (k * 2));
    }
}
