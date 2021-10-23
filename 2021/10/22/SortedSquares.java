/**
 * https://leetcode.com/problems/squares-of-a-sorted-array/
 * @author Andrew Jarombek
 * @since 10/22/2021
 */

import java.util.Arrays;

public class SortedSquares {
    public int[] sortedSquares(int[] nums) {
        for (int i = 0; i < nums.length; i++) {
            nums[i] = nums[i] * nums[i];
        }

        Arrays.sort(nums);
        return nums;
    }
}
