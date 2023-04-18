/*
 * https://leetcode.com/problems/min-cost-climbing-stairs/
 * https://leetcode.com/problems/largest-number-at-least-twice-of-others/
 * @author Andrew Jarombek
 * @since 4/17/2023
 */

package com.jarombek;

class Solution {
    public int minCostClimbingStairs(int[] cost) {
        for (int i = 2; i < cost.length; i++) {
            cost[i] += Math.min(cost[i-1], cost[i-2]);
        }

        return Math.min(cost[cost.length-1], cost[cost.length-2]);
    }

    public int dominantIndex(int[] nums) {
        int first = nums[0];
        int second = -1;
        int index = 0;

        for (int i = 1; i < nums.length; i++) {
            int num = nums[i];

            if (num > first) {
                second = first;
                first = num;
                index = i;
            } else if (num > second) {
                second = num;
            }
        }

        if (first >= second * 2) {
            return index;
        }

        return -1;
    }
}
