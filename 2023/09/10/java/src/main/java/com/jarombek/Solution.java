/*
 * https://leetcode.com/problems/shortest-distance-to-a-character/
 * @author Andrew Jarombek
 * @since 9/10/2023
 */

package com.jarombek;

import java.util.*;

public class Solution {
    public int[] shortestToChar(String s, char c) {
        List<Integer> indices = new ArrayList<>();

        for (int i = 0; i < s.length(); i++) {
            char ch = s.charAt(i);
            if (ch == c) {
                indices.add(i);
            }
        }

        int[] result = new int[s.length()];
        int index = 0;

        for (int i = 0; i < s.length(); i++) {
            int left = indices.get(index);
            int right = indices.get(index);

            if (index > 0) {
                left = indices.get(index - 1);
            }

            result[i] = Math.min(Math.abs(i - left), Math.abs(i - right));

            if (i == right && index < indices.size() - 1) {
                index++;
            }
        }

        return result;
    }
}
