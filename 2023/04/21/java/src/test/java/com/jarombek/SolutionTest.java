/*
 * Unit tests for a toeplitz-matrix program
 * @author Andrew Jarombek
 * @since 4/21/2023
 */

package com.jarombek;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    public void isToeplitzMatrix() {
        var solution = new Solution();
        int[][] matrix = {
                {1,2,3,4},
                {5,1,2,3},
                {9,5,1,2}
        };

        var result = solution.isToeplitzMatrix(matrix);
        assertTrue(result);

        int[][] matrix2 = {
                {1,2,3,4},
                {5,1,2,3},
                {9,5,1,3}
        };

        result = solution.isToeplitzMatrix(matrix2);
        assertFalse(result);
    }
}
