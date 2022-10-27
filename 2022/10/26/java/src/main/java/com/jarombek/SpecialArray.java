/*
 * https://leetcode.com/problems/special-array-with-x-elements-greater-than-or-equal-x/
 * @author Andrew Jarombek
 * @since 10/26/2022
 */

package com.jarombek;

import java.util.Arrays;

public class SpecialArray {
    public static int specialArray(int[] nums) {
        Arrays.sort(nums);

        int index = 0;
        int prev = 0;
        int val = nums.length;

        while (index < nums.length) {
            int num = nums[index];

            if (num >= val && val > prev)
                return val;

            prev = num;
            index++;
            val--;
        }

        return -1;
    }
}
