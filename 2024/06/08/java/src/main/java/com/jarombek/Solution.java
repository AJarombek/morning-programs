/*
 * https://leetcode.com/problems/delete-columns-to-make-sorted/
 * @author Andrew Jarombek
 * @since 6/8/2024
 */

package com.jarombek;

class Solution {
    public int minDeletionSize(String[] strs) {
        int y = strs[0].length();
        int x = strs.length;
        int result = 0;

        for (int i = 0; i < y; i++) {
            for (int j = 1; j < x; j++) {
                if (strs[j].charAt(i) < strs[j-1].charAt(i)) {
                    result++;
                    break;
                }
            }
        }

        return result;
    }
}
