/*
 * https://leetcode.com/problems/uncommon-words-from-two-sentences/
 * @author Andrew Jarombek
 * @since 9/22/2023
 */

package com.jarombek;

import java.util.HashMap;
import java.util.HashSet;

public class Solution {
    public String[] uncommonFromSentences(String s1, String s2) {
        var s1Map = new HashMap<String, Integer>();
        var s2Map = new HashMap<String, Integer>();

        for (String word : s1.split(" ")) {
            s1Map.put(word, s1Map.getOrDefault(word, 0) + 1);
        }

        for (String word : s2.split(" ")) {
            s2Map.put(word, s2Map.getOrDefault(word, 0) + 1);
        }

        var uncommonWords = new HashSet<String>();

        for (String word : s1Map.keySet()) {
            if (s1Map.get(word) == 1 && !s2Map.containsKey(word)) {
                uncommonWords.add(word);
            }
        }

        for (String word : s2Map.keySet()) {
            if (s2Map.get(word) == 1 && !s1Map.containsKey(word)) {
                uncommonWords.add(word);
            }
        }

        return uncommonWords.toArray(new String[0]);
    }
}
