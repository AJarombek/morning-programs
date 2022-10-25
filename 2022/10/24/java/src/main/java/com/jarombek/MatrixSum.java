/*
 * https://leetcode.com/problems/matrix-diagonal-sum/
 * @author Andrew Jarombek
 * @since 10/24/2022
 */

package com.jarombek;

public class MatrixSum {
    public static int diagonalSum(int[][] mat) {
        int x = 0;
        int y = mat.length - 1;
        int sum = 0;

        while (x < mat.length) {
            sum += mat[x][x];

            if (x != y)
                sum += mat[x][y];

            x++;
            y--;
        }

        return sum;
    }
}
