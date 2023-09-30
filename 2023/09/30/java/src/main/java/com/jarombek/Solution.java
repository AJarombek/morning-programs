/*
 * https://leetcode.com/problems/x-of-a-kind-in-a-deck-of-cards/
 * @author Andrew Jarombek
 * @since 9/30/2023
 */

package com.jarombek;

import java.util.HashMap;

class Solution {
    public boolean hasGroupsSizeX(int[] deck) {
        var map = new HashMap<Integer, Integer>();
        int gcd = 0;

        for (int num : deck) {
            var val = map.getOrDefault(num, 0) + 1;
            map.put(num, val);
            gcd = Math.max(gcd, val);
        }

        for (int val : map.values()) {
            gcd = gcd(Math.min(gcd, val), Math.max(gcd, val));
        }

        return gcd >= 2;
    }

    private int gcd(int a, int b) {
        if (a == 0) return b;
        return gcd(b % a, a);
    }
}
