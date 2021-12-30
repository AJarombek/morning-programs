/**
 * https://leetcode.com/problems/minimum-difference-between-highest-and-lowest-of-k-scores/
 * @author Andrew Jarombek
 * @since 12/30/2021
 */

import java.util.Arrays;

public class MinimumDifference {
    public int minimumDifference(int[] nums, int k) {
        Arrays.sort(nums);
        int minDiff = Integer.MAX_VALUE;

        for (int i = k -1; i < nums.length; i++) {
            minDiff = Math.min(minDiff, nums[i] - nums[i - k + 1]);
        }

        return minDiff;
    }
}
