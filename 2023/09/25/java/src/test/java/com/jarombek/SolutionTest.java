/*
 * Unit tests for a surface-area-of-3d-shapes program
 * @author Andrew Jarombek
 * @since 9/25/2023
 */

package com.jarombek;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void testSurfaceArea() {
        Solution solution = new Solution();

        int[][] grid1 = new int[][] {
            {2}
        };

        assertEquals(10, solution.surfaceArea(grid1));

        int[][] grid2 = new int[][] {
            {1, 2},
            {3, 4}
        };

        assertEquals(34, solution.surfaceArea(grid2));
    }
}
