/*
 * Unit tests for a shortest-distance-to-a-character program
 * @author Andrew Jarombek
 * @since 9/10/2023
 */

package com.jarombek;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    public void mostCommonWord() {
        var solution = new Solution();

        assertArrayEquals(new int[]{0, 1, 2, 1, 0}, solution.shortestToChar("baaab", 'b'));
        assertArrayEquals(new int[]{0, 1, 2, 3}, solution.shortestToChar("baaa", 'b'));
    }
}
