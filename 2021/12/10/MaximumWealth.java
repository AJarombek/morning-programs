/**
 * https://leetcode.com/problems/richest-customer-wealth/
 * @author Andrew Jarombek
 * @since 12/10/2021
 */

public class MaximumWealth {
    public int maximumWealth(int[][] accounts) {
        int max = 0;

        for (int[] account : accounts) {
            int total = 0;

            for (int value : account) {
                total += value;
            }

            max = Math.max(max, total);
        }

        return max;
    }
}
