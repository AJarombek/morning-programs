/**
 * https://leetcode.com/problems/maximize-sum-of-array-after-k-negations/
 * @author Andrew Jarombek
 * @since 10/25/2021
 */

import java.util.Arrays;

public class SumAfterNegations {
    public int largestSumAfterKNegations(int[] nums, int k) {
        Arrays.sort(nums);

        int index = 0;
        while (index < nums.length && nums[index] < 0 && k > 0) {
            nums[index] = 0 - nums[index];
            index++;
            k--;
        }

        if (k % 2 == 1) {
            if (index == nums.length || index != 0 && nums[index] > nums[index - 1]) {
                nums[index - 1] = 0 - nums[index - 1];
            } else {
                nums[index] = 0 - nums[index];
            }
        }

        int result = 0;
        for (int num : nums) {
            result += num;
        }

        return result;
    }
}
