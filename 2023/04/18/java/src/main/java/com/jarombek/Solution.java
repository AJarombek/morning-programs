/*
 * https://leetcode.com/problems/shortest-completing-word/
 * @author Andrew Jarombek
 * @since 4/18/2023
 */

package com.jarombek;

import java.util.HashMap;
import java.util.Map;

class Solution {
    public String shortestCompletingWord(String licensePlate, String[] words) {
        Map<Character, Integer> occurrences = new HashMap<>();

        for (char c : licensePlate.toLowerCase().toCharArray()) {
            if (c != ' ' && (c < '0' || c > '9')) {
                occurrences.put(c, occurrences.getOrDefault(c, 0) + 1);
            }
        }

        String result = null;

        for (String w : words) {
            String word = w.toLowerCase();
            Map<Character, Integer> values = new HashMap<>(occurrences);

            for (char c : word.toCharArray()) {
                if (values.containsKey(c)) {
                    int value = values.getOrDefault(c, 0) - 1;

                    if (value == 0) {
                        values.remove(c);
                    } else {
                        values.put(c, value);
                    }
                }
            }

            System.out.println(values.size());

            if (values.isEmpty() && (result == null || word.length() < result.length())) {
                result = word;
            }
        }

        return result;
    }
}
