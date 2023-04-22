/*
 * https://leetcode.com/problems/toeplitz-matrix/
 * @author Andrew Jarombek
 * @since 4/21/2023
 */

package com.jarombek;

public class Solution {
    public boolean isToeplitzMatrix(int[][] matrix) {
        if (matrix.length == 1 || matrix[0].length == 1) {
            return true;
        }

        for (int i = 1; i < matrix.length; i++) {
            for (int j = 1; j < matrix[0].length; j++) {
                if (matrix[i][j] != matrix[i-1][j-1]) {
                    return false;
                }
            }
        }

        return true;
    }
}
