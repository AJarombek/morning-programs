/**
 * https://leetcode.com/problems/check-if-a-word-occurs-as-a-prefix-of-any-word-in-a-sentence/
 * @author Andrew Jarombek
 * @since 11/27/2021
 */

public class ShuffleArray {
    public int[] shuffle(int[] nums, int n) {
        int[] result = nums.clone();

        for (int i = 0; i < n; i++) {
            result[i * 2] = nums[i];
            result[i * 2 + 1] = nums[n + i];
        }

        return result;
    }
}
