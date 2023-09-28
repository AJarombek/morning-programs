/*
 * https://leetcode.com/problems/sort-array-by-parity/
 * @author Andrew Jarombek
 * @since 9/28/2023
 */

package com.jarombek;

class Solution {
    public int[] sortArrayByParity(int[] nums) {
        int start = 0;
        int end = nums.length - 1;

        while (start < end) {
            if (nums[start] % 2 == 0) {
                start++;
            } else if (nums[end] % 2 == 1) {
                end--;
            } else {
                int temp = nums[start];
                nums[start] = nums[end];
                nums[end] = temp;

                start++;
                end--;
            }
        }

        return nums;
    }
}
