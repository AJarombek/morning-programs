/*
 * https://leetcode.com/problems/backspace-string-compare/
 * @author Andrew Jarombek
 * @since 9/14/2023
 */

package com.jarombek;

public class Solution {
    public boolean backspaceCompare(String s, String t) {
        int i = s.length() - 1;
        int j = t.length() - 1;

        int sBackspaces = 0;
        int tBackspaces = 0;

        while (i >= 0 || j >= 0) {
            while (i >= 0 && (s.charAt(i) == '#' || sBackspaces > 0)) {
                if (s.charAt(i) == '#') {
                    sBackspaces++;
                } else {
                    sBackspaces--;
                }

                i--;
            }

            while (j >= 0 && (t.charAt(j) == '#' || tBackspaces > 0)) {
                if (t.charAt(j) == '#') {
                    tBackspaces++;
                } else {
                    tBackspaces--;
                }

                j--;
            }

            if (i >= 0 && j >= 0 && s.charAt(i) != t.charAt(j)) {
                return false;
            }

            if ((i >= 0 && j < 0) || (j >= 0 && i < 0)) {
                return false;
            }

            i--;
            j--;
        }

        return true;
    }
}
