/*
 * Unit tests for a buddy-strings program
 * @author Andrew Jarombek
 * @since 9/15/2023
 */

package com.jarombek;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    public void testBuddyStrings() {
        Solution solution = new Solution();

        assertTrue(solution.buddyStrings("ab", "ba"));
        assertFalse(solution.buddyStrings("ab", "ab"));
        assertTrue(solution.buddyStrings("aa", "aa"));
    }
}
