/*
 * Unit tests for a transpose-matrix program
 * @author Andrew Jarombek
 * @since 9/17/2023
 */

package com.jarombek;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    public void testTransposeSquareMatrix() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}, {7, 8, 9}};
        int[][] expected = {{1, 4, 7}, {2, 5, 8}, {3, 6, 9}};
        int[][] result = new Solution().transpose(matrix);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testTransposeRectangularMatrix() {
        int[][] matrix = {{1, 2, 3}, {4, 5, 6}};
        int[][] expected = {{1, 4}, {2, 5}, {3, 6}};
        int[][] result = new Solution().transpose(matrix);
        assertArrayEquals(expected, result);
    }
}
