/*
 * Unit tests for a backspace-string-compare program
 * @author Andrew Jarombek
 * @since 9/14/2023
 */

package com.jarombek;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    public void testBackspaceCompare() {
        Solution solution = new Solution();

        assertTrue(solution.backspaceCompare("ab#c", "ad#c"));
        assertTrue(solution.backspaceCompare("ab##", "c#d#"));
        assertFalse(solution.backspaceCompare("a#c", "b"));
    }
}
