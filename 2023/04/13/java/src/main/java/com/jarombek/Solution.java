/*
 * https://leetcode.com/problems/self-dividing-numbers/
 * @author Andrew Jarombek
 * @since 4/13/2023
 */

package com.jarombek;

import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<Integer> selfDividingNumbers(int left, int right) {
        List<Integer> result = new ArrayList<>();

        for (int i = left; i <= right; i++) {
            int n = i;
            boolean divisible = true;

            while (divisible && n > 0) {
                int mod = n % 10;

                if (mod == 0 || i % mod != 0) {
                    divisible = false;
                }

                n /= 10;
            }

            if (divisible) {
                result.add(i);
            }
        }

        return result;
    }
}
