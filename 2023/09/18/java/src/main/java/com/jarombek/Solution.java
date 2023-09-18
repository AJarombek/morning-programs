/*
 * https://leetcode.com/problems/binary-gap/
 * @author Andrew Jarombek
 * @since 9/18/2023
 */

package com.jarombek;

public class Solution {
    public int binaryGap(int n) {
        boolean found = false;
        int prev = 0;
        int index = 0;
        int max = 0;

        while (n > 0) {
            int bit = n & 1;
            n >>= 1;

            if (bit == 1) {
                if (found) {
                    max = Math.max(max, index - prev);
                } else {
                    found = true;
                }

                prev = index;
            }

            index++;
        }

        return max;
    }
}
