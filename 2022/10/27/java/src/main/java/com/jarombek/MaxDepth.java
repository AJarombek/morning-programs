/*
 * https://leetcode.com/problems/maximum-nesting-depth-of-the-parentheses/
 * @author Andrew Jarombek
 * @since 10/27/2022
 */

package com.jarombek;

class MaxDepth {
    public static int maxDepth(String s) {
        int maxDepth = 0;
        int depth = 0;

        for (char c : s.toCharArray()) {
            if (c == '(') {
                depth++;
                maxDepth = Math.max(depth, maxDepth);
            } else if (c == ')') {
                depth--;
            }
        }

        return maxDepth;
    }
}
