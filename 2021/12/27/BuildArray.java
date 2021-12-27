/**
 * https://leetcode.com/problems/build-array-from-permutation/
 * @author Andrew Jarombek
 * @since 12/27/2021
 */

public class BuildArray {
    public int[] buildArray(int[] nums) {
        int[] result = new int[nums.length];

        for (int i = 0; i < nums.length; i++) {
            result[i] = nums[nums[i]];
        }

        return result;
    }
}
