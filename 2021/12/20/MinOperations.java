/**
 * https://leetcode.com/problems/determine-color-of-a-chessboard-square/
 * @author Andrew Jarombek
 * @since 12/20/2021
 */

public class MinOperations {
    public int minOperations(int[] nums) {
        int result = 0;
        int previous = 0;

        for (int num : nums) {
            int change = Math.max(previous - num + 1, 0);
            result += change;
            previous = num + change;
        }

        return result;
    }
}
