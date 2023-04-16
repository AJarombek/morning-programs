/*
 * https://leetcode.com/problems/find-smallest-letter-greater-than-target/
 * @author Andrew Jarombek
 * @since 4/16/2023
 */

package com.jarombek;

class Solution {
    public char nextGreatestLetter(char[] letters, char target) {
        Character c = null;

        for (char letter : letters) {
            if (letter > target) {
                if (c == null || letter < c) {
                    c = letter;
                }
            }
        }

        if (c == null) {
            return letters[0];
        }

        return c;
    }
}
