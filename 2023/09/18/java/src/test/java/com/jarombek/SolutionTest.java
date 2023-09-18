/*
 * Unit tests for a binary-gap program
 * @author Andrew Jarombek
 * @since 9/18/2023
 */

package com.jarombek;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    public void testBinaryGap() {
        var solution = new Solution();
        assertEquals(2, solution.binaryGap(22));
        assertEquals(0, solution.binaryGap(8));
        assertEquals(2, solution.binaryGap(5));
    }
}
