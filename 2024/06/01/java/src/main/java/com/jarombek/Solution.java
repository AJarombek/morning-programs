/*
 * https://leetcode.com/problems/valid-mountain-array/
 * @author Andrew Jarombek
 * @since 6/1/2024
 */

package com.jarombek;

class Solution {
    public boolean validMountainArray(int[] arr) {
        if (arr.length < 3 || arr[0] >= arr[1]) {
            return false;
        }

        boolean downwards = false;
        int index = 2;

        while (index < arr.length) {
            if (downwards) {
                if (arr[index] >= arr[index-1]) {
                    return false;
                }
            } else {
                if (arr[index] < arr[index-1]) {
                    downwards = true;
                }
            }

            index++;
        }

        return downwards;
    }
}
