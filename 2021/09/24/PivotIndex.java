/**
 * https://leetcode.com/problems/find-pivot-index/
 * @author Andrew Jarombek
 * @since 9/24/2021
 */

public class PivotIndex {
    public int pivotIndex(int[] nums) {
        int left = 0;
        int right = 0;

        for (int num: nums) {
            left += num;
        }

        for (int i = 0; i < nums.length; i++) {
            left -= nums[i];

            if (left == right) {
                return i;
            }

            right += nums[i];
        }

        return -1;
    }
}
