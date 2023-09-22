/*
 * Unit tests for a projection-area-of-3d-shapes program
 * @author Andrew Jarombek
 * @since 9/21/2023
 */

package com.jarombek;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void testProjectionAreaExample1() {
        Solution solution = new Solution();
        int[][] grid = {
                {1, 2},
                {3, 4}
        };
        int expected = 17; // Expected projection area
        int result = solution.projectionArea(grid);
        assertEquals(expected, result);
    }

    @Test
    public void testProjectionAreaExample2() {
        Solution solution = new Solution();
        int[][] grid = {
                {2, 2, 2},
                {2, 1, 2},
                {2, 2, 2}
        };
        int expected = 21; // Expected projection area
        int result = solution.projectionArea(grid);
        assertEquals(expected, result);
    }
}

