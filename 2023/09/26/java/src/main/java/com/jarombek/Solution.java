/*
 * https://leetcode.com/problems/monotonic-array/
 * @author Andrew Jarombek
 * @since 9/26/2023
 */

package com.jarombek;

class Solution {
    public boolean isMonotonic(int[] nums) {
        boolean increasing = nums[nums.length-1] >= nums[0];

        for (int i = 1; i < nums.length; i++) {
            if (increasing) {
                if (nums[i] < nums[i-1]) {
                    return false;
                }
            } else {
                if (nums[i] > nums[i-1]) {
                    return false;
                }
            }
        }

        return true;
    }
}
