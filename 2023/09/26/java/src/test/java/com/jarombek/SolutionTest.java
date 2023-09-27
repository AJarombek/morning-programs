/*
 * Unit tests for a monotonic-array program
 * @author Andrew Jarombek
 * @since 9/26/2023
 */

package com.jarombek;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void testIsMonotonic() {
        Solution solution = new Solution();

        assertTrue(solution.isMonotonic(new int[]{1, 2, 2, 3}));
        assertTrue(solution.isMonotonic(new int[]{6, 5, 4, 4}));
        assertFalse(solution.isMonotonic(new int[]{1, 3, 2}));
    }
}
