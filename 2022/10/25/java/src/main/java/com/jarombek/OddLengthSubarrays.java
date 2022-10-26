/*
 * https://leetcode.com/problems/sum-of-all-odd-length-subarrays/
 * @author Andrew Jarombek
 * @since 10/25/2022
 */

package com.jarombek;

public class OddLengthSubarrays {
    public static int sumOddLengthSubarrays(int[] arr) {
        int result = 0;
        int length = 1;

        while (length <= arr.length) {
            int val = 0;

            for (int i = 0; i < length; i++) {
                val += arr[i];
            }

            result += val;

            for (int i = length; i < arr.length; i++) {
                val += arr[i];
                val -= arr[i - length];
                result += val;
            }

            length += 2;
        }

        return result;
    }
}
