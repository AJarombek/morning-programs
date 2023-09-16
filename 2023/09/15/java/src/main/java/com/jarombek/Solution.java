/*
 * https://leetcode.com/problems/buddy-strings/
 * @author Andrew Jarombek
 * @since 9/15/2023
 */

package com.jarombek;

import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

public class Solution {
    public boolean buddyStrings(String s, String goal) {
        if (s.length() != goal.length()) {
            return false;
        }

        if (s.equals(goal)) {
            Set<Character> charSet = new HashSet<>();

            for (int i = 0; i < s.length(); i++) {
                if (charSet.contains(s.charAt(i))) {
                    return true;
                } else {
                    charSet.add(s.charAt(i));
                }
            }

            return false;
        }

        Map<Character, Character> charMap = new HashMap<>();
        int mismatches = 0;

        for (int i = 0; i < s.length(); i++) {
            char c = s.charAt(i);
            char g = goal.charAt(i);

            if (c != g) {
                charMap.put(c, g);
                mismatches++;

                if (mismatches > 2) {
                    return false;
                }
            }
        }

        if (charMap.size() != 2) {
            return false;
        }

        for (Map.Entry<Character, Character> entry : charMap.entrySet()) {
            if (charMap.get(entry.getValue()) != entry.getKey()) {
                return false;
            }
        }

        return true;
    }
}
