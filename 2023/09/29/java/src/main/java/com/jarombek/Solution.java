/*
 * https://leetcode.com/problems/smallest-range-i/
 * @author Andrew Jarombek
 * @since 9/29/2023
 */

package com.jarombek;

class Solution {
    public int smallestRangeI(int[] nums, int k) {
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (int num : nums) {
            max = Math.max(max, num);
            min = Math.min(min, num);
        }

        return Math.max(0, max - min - k * 2);
    }
}
