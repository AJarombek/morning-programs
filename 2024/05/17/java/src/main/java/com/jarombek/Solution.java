/*
 * https://leetcode.com/problems/sort-array-by-parity-ii/
 * @author Andrew Jarombek
 * @since 5/17/2024
 */

package com.jarombek;

class Solution {
    public int[] sortArrayByParityII(int[] nums) {
        int i = 0;
        int j = 1;

        while (i < nums.length) {
            if (nums[i] % 2 != 0) {
                boolean swapped = false;

                while (!swapped) {
                    if (nums[j] % 2 == 0) {
                        int temp = nums[i];
                        nums[i] = nums[j];
                        nums[j] = temp;
                        swapped = true;
                    }

                    j += 2;
                }
            }

            i += 2;
        }

        return nums;
    }
}
