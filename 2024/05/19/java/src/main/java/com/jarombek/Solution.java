/*
 * https://leetcode.com/problems/long-pressed-name/
 * @author Andrew Jarombek
 * @since 5/19/2024
 */

package com.jarombek;

class Solution {
    public boolean isLongPressedName(String name, String typed) {
        int i = 0;
        int j = 0;

        while (i < name.length()) {
            char c = name.charAt(i);
            i++;

            int x = 1;
            int y = 0;

            while (i < name.length() && name.charAt(i) == c) {
                i++;
                x++;
            }

            while (j < typed.length() && typed.charAt(j) == c) {
                j++;
                y++;
            }

            if (y < x) {
                return false;
            }
        }

        return j == typed.length();
    }
}
