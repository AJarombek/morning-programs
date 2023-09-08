/*
 * Unit tests for a unique-morse-code-words program
 * @author Andrew Jarombek
 * @since 9/7/2023
 */

package com.jarombek;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    public void uniqueMorseRepresentations() {
        var solution = new Solution();

        assertEquals(solution.uniqueMorseRepresentations(new String[]{"gin","zen","gig","msg"}), 2);
        assertEquals(solution.uniqueMorseRepresentations(new String[]{"a"}), 1);
    }
}
