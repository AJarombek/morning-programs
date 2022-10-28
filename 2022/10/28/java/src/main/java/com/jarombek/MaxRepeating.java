/*
 * https://leetcode.com/problems/maximum-repeating-substring/
 * @author Andrew Jarombek
 * @since 10/28/2022
 */

package com.jarombek;

class MaxRepeating {
    public static int maxRepeating(String sequence, String word) {
        int result = 0;

        for (int i = 0; i <= sequence.length() - ((result + 1) * word.length()); i++) {
            int j = i;
            int val = 0;

            while (j <= sequence.length() - word.length() && sequence.startsWith(word, j)) {
                val++;
                j += word.length();
            }

            result = Math.max(result, val);
        }

        return result;
    }
}
