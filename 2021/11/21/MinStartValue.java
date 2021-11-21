/**
 * https://leetcode.com/problems/minimum-value-to-get-positive-step-by-step-sum/
 * @author Andrew Jarombek
 * @since 11/21/2021
 */

public class MinStartValue {
    public int minStartValue(int[] nums) {
        int lowest = 0;

        int sum = 0;
        for (int num : nums) {
            sum += num;

            if (sum < lowest) {
                lowest = sum;
            }
        }

        return Math.abs(lowest - 1);
    }
}
