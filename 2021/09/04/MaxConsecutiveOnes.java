/**
 * https://leetcode.com/problems/max-consecutive-ones/
 * @author Andrew Jarombek
 * @since 9/4/2021
 */

public class MaxConsecutiveOnes {
    public static int findMaxConsecutiveOnes(int[] nums) {
        int max = 0;
        int lastZero = -1;

        for (int i = 0; i < nums.length; i++) {
            if (nums[i] == 0) {
                max = Math.max(max, i - lastZero - 1);
                lastZero = i;
            }
        }

        max = Math.max(max, nums.length - lastZero - 1);

        return max;
    }

    public static void main(String[] args) {
        assert findMaxConsecutiveOnes(new int[] {1, 1, 0, 1, 1, 1}) == 3;
    }
}
