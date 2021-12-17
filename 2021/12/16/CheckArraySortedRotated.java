/**
 * https://leetcode.com/problems/check-if-array-is-sorted-and-rotated/
 * @author Andrew Jarombek
 * @since 12/16/2021
 */

public class CheckArraySortedRotated {
    public boolean check(int[] nums) {
        int decreasingCount = 0;
        int previous = nums[nums.length - 1];

        for (int num : nums) {
            if (num < previous) {
                decreasingCount++;

                if (decreasingCount > 1) {
                    return false;
                }
            }

            previous = num;
        }

        return true;
    }
}
