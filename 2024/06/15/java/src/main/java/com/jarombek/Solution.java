/*
 * https://leetcode.com/problems/n-repeated-element-in-size-2n-array/
 * @author Andrew Jarombek
 * @since 6/15/2024
 */

package com.jarombek;

import java.util.HashSet;
import java.util.Set;

class Solution {
    public int repeatedNTimes(int[] nums) {
        Set<Integer> set = new HashSet<>();

        for (int num : nums) {
            if (set.contains(num)) {
                return num;
            }

            set.add(num);
        }

        return -1;
    }
}
