/*
 * https://leetcode.com/problems/fair-candy-swap/
 * @author Andrew Jarombek
 * @since 9/24/2023
 */

package com.jarombek;

public class Solution {
    public int[] fairCandySwap(int[] aliceSizes, int[] bobSizes) {
        int bobSum = 0;
        int aliceSum = 0;

        for (int val : bobSizes) {
            bobSum += val;
        }

        for (int val : aliceSizes) {
            aliceSum += val;
        }

        for (int a : aliceSizes) {
            for (int b : bobSizes) {
                if (bobSum - b + a == aliceSum - a + b) {
                    return new int[]{a, b};
                }
            }
        }

        return new int[]{};
    }
}
