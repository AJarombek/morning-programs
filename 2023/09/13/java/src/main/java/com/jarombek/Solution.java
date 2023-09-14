/*
 * https://leetcode.com/problems/flipping-an-image/
 * @author Andrew Jarombek
 * @since 9/13/2023
 */

package com.jarombek;

public class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
        int[][] result = new int[image.length][image[0].length];

        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[0].length; j++) {
                result[i][j] = image[i][image[0].length - j - 1] == 0 ? 1 : 0;
            }
        }

        return result;
    }
}
