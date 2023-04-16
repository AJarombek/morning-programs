/*
 * Unit tests for to-lower-case program
 * @author Andrew Jarombek
 * @since 4/15/2023
 */

package com.jarombek;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    public void toLowerCase() {
        var solution = new Solution();
        var result = solution.toLowerCase("Hello");
        assertEquals("hello", result);
    }
}
