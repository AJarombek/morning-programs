/**
 * https://leetcode.com/problems/range-sum-query-immutable
 * @author Andrew Jarombek
 * @since 7/13/2022
 */

public class NumArray {
    private final int[] nums;

    public NumArray(int[] nums) {
        this.nums = nums;
    }

    public int sumRange(int left, int right) {
        int result = 0;

        for (int i = left; i <= right; i++) {
            result += this.nums[i];
        }

        return result;
    }

    public static void main(String[] args) {
        int[] nums = new int[] {1, 2, 3, 4, 5};
        NumArray numArray = new NumArray(nums);

        assert numArray.sumRange(0, 2) == 6;
    }
}
