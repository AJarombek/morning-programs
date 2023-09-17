/*
 * https://leetcode.com/problems/transpose-matrix/
 * @author Andrew Jarombek
 * @since 9/17/2023
 */

package com.jarombek;

public class Solution {
    public int[][] transpose(int[][] matrix) {
        int[][] result = new int[matrix[0].length][matrix.length];

        for (int i = 0; i < matrix[0].length; i++) {
            int[] row = new int[matrix.length];

            for (int j = 0; j < matrix.length; j++) {
                row[j] = matrix[j][i];
            }

            result[i] = row;
        }

        return result;
    }
}
