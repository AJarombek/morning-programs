/*
 * Unit tests for a number-of-lines-to-write-string program
 * @author Andrew Jarombek
 * @since 9/8/2023
 */

package com.jarombek;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    public void numberOfLines() {
        var solution = new Solution();

        assertArrayEquals(new int[]{2, 50}, solution.numberOfLines(new int[]{4, 50, 50}, "abc"));
        assertArrayEquals(new int[]{2, 4}, solution.numberOfLines(new int[]{4, 50, 50}, "cba"));
    }
}
