/*
 * https://leetcode.com/problems/goat-latin/
 * @author Andrew Jarombek
 * @since 9/11/2023
 */

package com.jarombek;

import java.util.*;

public class Solution {
    public String toGoatLatin(String sentence) {
        Set<Character> vowels = new HashSet<>(Arrays.asList('a', 'e', 'i', 'o', 'u', 'A', 'E', 'I', 'O', 'U'));
        int index = 0;
        StringBuilder result = new StringBuilder();

        for (String word : sentence.split(" ")) {
            if (index > 0) {
                result.append(' ');
            }

            if (!vowels.contains(word.charAt(0))) {
                word = word.substring(1) + word.charAt(0);
            }

            result.append(word).append("ma").append("a".repeat(index + 1));
            index++;
        }

        return result.toString();
    }
}
