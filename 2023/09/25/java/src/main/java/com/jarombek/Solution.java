/*
 * https://leetcode.com/problems/surface-area-of-3d-shapes/
 * @author Andrew Jarombek
 * @since 9/25/2023
 */

package com.jarombek;

public class Solution {
    public int surfaceArea(int[][] grid) {
        int result = 0;

        for (int i = 0; i < grid.length; i++) {
            for (int j = 0; j < grid[0].length; j++) {
                int val = grid[i][j];

                if (val > 0) {
                    result += 2;
                }

                int top = i > 0 ? grid[i-1][j] : 0;
                int left = j > 0 ? grid[i][j-1] : 0;
                int right = j < grid[0].length - 1 ? grid[i][j+1] : 0;
                int bottom = i < grid.length - 1 ? grid[i+1][j] : 0;

                result += Math.max(0, val - top);
                result += Math.max(0, val - left);
                result += Math.max(0, val - right);
                result += Math.max(0, val - bottom);
            }
        }

        return result;
    }
}
