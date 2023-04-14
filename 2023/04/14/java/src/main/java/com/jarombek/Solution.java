/*
 * https://leetcode.com/problems/flood-fill/
 * @author Andrew Jarombek
 * @since 4/14/2023
 */

package com.jarombek;

class Solution {
    public int[][] floodFill(int[][] image, int sr, int sc, int color) {
        if (image[sr][sc] == color) {
            return image;
        }

        return floodFillRecurse(image, sr, sc, color);
    }

    private int[][] floodFillRecurse(int[][] image, int sr, int sc, int color) {
        int value = image[sr][sc];
        image[sr][sc] = color;


        if (sr > 0 && image[sr-1][sc] == value) {
            floodFill(image, sr-1, sc, color);
        }

        if (sr < image.length - 1 && image[sr+1][sc] == value) {
            floodFill(image, sr+1, sc, color);
        }

        if (sc > 0 && image[sr][sc-1] == value) {
            floodFill(image, sr, sc-1, color);
        }

        if (sc < image[0].length - 1 && image[sr][sc+1] == value) {
            floodFill(image, sr, sc+1, color);
        }

        return image;
    }
}
