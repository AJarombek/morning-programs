/*
 * Unit tests for flood-fill program
 * @author Andrew Jarombek
 * @since 4/14/2023
 */

package com.jarombek;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    public void floodFill() {
        var solution = new Solution();
        var result = solution.floodFill(new int[][] {{1, 1, 1}, {1, 1, 0}, {1, 0, 1}}, 1, 1, 2);
        assertEquals(2, result[0][0]);
        assertEquals(2, result[0][1]);
        assertEquals(2, result[0][2]);

        assertEquals(2, result[1][0]);
        assertEquals(2, result[1][1]);
        assertEquals(0, result[1][2]);

        assertEquals(2, result[2][0]);
        assertEquals(0, result[2][1]);
        assertEquals(1, result[2][2]);
    }
}
