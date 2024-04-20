/*
 * https://leetcode.com/problems/reverse-only-letters/
 * @author Andrew Jarombek
 * @since 4/20/2024
 */

package com.jarombek;

class Solution {
    public String reverseOnlyLetters(String s) {
        int start = 0;
        int end = s.length();

        char[] chars = s.toCharArray();

        while (start < end) {
            char first = chars[start];

            if (first < 65 || (first > 90 && first < 97) || first > 122) {
                start++;
                continue;
            }

            char last = chars[end - 1];

            if (last < 65 || (last > 90 && last < 97) || last > 122) {
                end--;
                continue;
            }

            chars[start] = last;
            chars[end - 1] = first;
            start++;
            end--;
        }

        return new String(chars);
    }
}
