/**
 * https://leetcode.com/problems/range-sum-query-immutable/
 * @author Andrew Jarombek
 * @since 8/21/2021
 */

class NumArray {

    private int[] nums;

    public NumArray(int[] nums) {
        this.nums = nums;
    }

    public int sumRange(int left, int right) {
        int sum = 0;

        for (int i = left; i <= right; i++) {
            sum += this.nums[i];
        }

        return sum;
    }

    public static void main(String[] args) {
        NumArray numArray = new NumArray(new int[] {-2, 0, 3, -5, 2, -1});
        assert numArray.sumRange(0, 2) == 1;
    }
}