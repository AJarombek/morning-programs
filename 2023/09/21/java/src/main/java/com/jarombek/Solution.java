/*
 * https://leetcode.com/problems/projection-area-of-3d-shapes/
 * @author Andrew Jarombek
 * @since 9/21/2023
 */

package com.jarombek;

public class Solution {
    public int projectionArea(int[][] grid) {
        int top = 0;
        int[] front = new int[grid[0].length];
        int[] side = new int[grid.length];

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                int val = grid[i][j];

                if (val > 0)
                    top++;

                front[j] = Math.max(front[j], val);
                side[i] = Math.max(side[i], val);
            }
        }

        for (int val : front) {
            top += val;
        }

        for (int val : side) {
            top += val;
        }

        return top;
    }
}
