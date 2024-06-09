/*
 * https://leetcode.com/problems/verifying-an-alien-dictionary/
 * @author Andrew Jarombek
 * @since 6/9/2024
 */

package com.jarombek;

import java.util.HashMap;
import java.util.Map;

public class Solution {
    public boolean isAlienSorted(String[] words, String order) {
        Map<Character, Integer> weights = new HashMap<>();

        for (int i = 0; i < order.length(); i++) {
            weights.put(order.charAt(i), i);
        }

        for (int i = 1; i < words.length; i++) {
            if (compare(weights, words[i], words[i-1]) < 0) {
                return false;
            }
        }

        return true;
    }

    private int compare(Map<Character, Integer> weights, String s, String t) {
        int sLength = s.length();
        int tLength = t.length();

        for (int i = 0; i < Math.min(sLength, tLength); i++) {
            int x = weights.get(s.charAt(i));
            int y = weights.get(t.charAt(i));

            if (x > y) {
                return 1;
            }

            if (y > x) {
                return -1;
            }
        }

        if (sLength > tLength) {
            return 1;
        }

        if (tLength > sLength) {
            return -1;
        }

        return 0;
    }
}
