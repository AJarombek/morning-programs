/*
 * https://leetcode.com/problems/to-lower-case/
 * @author Andrew Jarombek
 * @since 4/15/2023
 */

package com.jarombek;

class Solution {
    public String toLowerCase(String s) {
        char[] letters = s.toCharArray();
        int index = 0;

        for (char c : letters) {
            if ((int) c >= 65 && (int) c <= 90) {
                char lowercase = (char) (c + 32);
                letters[index] = lowercase;
            }

            index++;
        }

        return String.valueOf(letters);
    }
}
