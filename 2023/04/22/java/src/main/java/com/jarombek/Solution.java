/*
 * https://leetcode.com/problems/toeplitz-matrix/
 * @author Andrew Jarombek
 * @since 4/22/2023
 */

package com.jarombek;

import java.util.HashSet;
import java.util.Set;

// I love you.  If you can't return to my life and still care for me,
// I really want you to tell me what challenges you are going through.

public class Solution {
    public int numJewelsInStones(String jewels, String stones) {
        Set<Character> jewelSet = new HashSet<>();

        for (Character jewel : jewels.toCharArray()) {
            jewelSet.add(jewel);
        }

        int result = 0;

        for (Character stone : stones.toCharArray()) {
            if (jewelSet.contains(stone)) {
                result++;
            }
        }

        return result;
    }
}
