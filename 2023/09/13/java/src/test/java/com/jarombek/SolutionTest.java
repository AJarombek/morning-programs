/*
 * Unit tests for a flipping-an-image program
 * @author Andrew Jarombek
 * @since 9/13/2023
 */

package com.jarombek;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    public void testFlipAndInvertImage1() {
        Solution solution = new Solution();
        int[][] image = {
                {1, 1, 0},
                {1, 0, 1},
                {0, 0, 0}
        };

        int[][] expected = {
                {1, 0, 0},
                {0, 1, 0},
                {1, 1, 1}
        };

        int[][] result = solution.flipAndInvertImage(image);

        assertArrayEquals(expected, result);
    }

    @Test
    public void testFlipAndInvertImage2() {
        Solution solution = new Solution();
        int[][] image = {
                {1, 0, 0},
                {0, 1, 1},
                {1, 0, 1}
        };

        int[][] expected = {
                {1, 1, 0},
                {0, 0, 1},
                {0, 1, 0}
        };

        int[][] result = solution.flipAndInvertImage(image);

        assertArrayEquals(expected, result);
    }
}
