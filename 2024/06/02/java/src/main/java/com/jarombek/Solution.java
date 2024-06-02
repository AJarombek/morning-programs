/*
 * https://leetcode.com/problems/di-string-match/
 * @author Andrew Jarombek
 * @since 6/2/2024
 */

package com.jarombek;

class Solution {
    public int[] diStringMatch(String s) {
        int high = s.length();
        int low = 0;

        char[] chars = s.toCharArray();
        int[] result = new int[s.length() + 1];

        for (int i = 0; i < chars.length; i++) {
            char c = chars[i];

            if (c == 'I') {
                result[i] = low;
                low++;
            } else {
                result[i] = high;
                high--;
            }
        }

        result[s.length()] = high;
        return result;
    }
}
