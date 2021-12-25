/**
 * https://leetcode.com/problems/remove-one-element-to-make-the-array-strictly-increasing/
 * @author Andrew Jarombek
 * @since 12/25/2021
 */

public class RemoveDirectlyIncreasing {
    public boolean canBeIncreasing(int[] nums) {
        int decreasing = 0;
        int previous = 0;
        int index = 0;

        while (decreasing < 2 && index < nums.length) {
            if (nums[index] <= previous) {
                decreasing++;

                if (index == 1 || index == nums.length - 1 || nums[index] > nums[index - 2]) {
                    previous = nums[index];
                } else if (index < nums.length - 1 && nums[index + 1] > nums[index - 1]) {
                    previous = nums[index - 1];
                } else {
                    decreasing++;
                }
            } else {
                previous = nums[index];
            }

            index++;
        }

        return decreasing < 2;
    }
}
