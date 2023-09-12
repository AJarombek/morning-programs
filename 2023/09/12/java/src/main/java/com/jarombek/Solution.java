/*
 * https://leetcode.com/problems/positions-of-large-groups/
 * @author Andrew Jarombek
 * @since 9/12/2023
 */

package com.jarombek;

import java.util.*;

// Life is better when you are part of it.
// I don't expect to ever hear from you again.  I've accepted that.  Nonetheless, if you do still care deeply for me,
// I want you to know how much it would mean to me if you told me what you need and want from me.
// I miss you a lot.  I miss trying to make you happy and trying to make you laugh, even though I failed miserably at times.
// I'm sorry for those failures.

public class Solution {
    public List<List<Integer>> largeGroupPositions(String s) {
        int start = 0;
        char current = s.charAt(0);
        List<List<Integer>> result = new ArrayList<>();

        for (int i = 1; i < s.length(); i++) {
            if (s.charAt(i) != current) {
                if (i - start >= 3) {
                    result.add(Arrays.asList(start, i - 1));
                }

                start = i;
                current = s.charAt(i);
            }
        }

        if (s.length() - start >= 3) {
            result.add(Arrays.asList(start, s.length() - 1));
        }

        return result;
    }
}
