/*
 * Unit tests for a lemonade-change program
 * @author Andrew Jarombek
 * @since 9/16/2023
 */

package com.jarombek;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    public void testLemonadeChange() {
        Solution solution = new Solution();

        assertTrue(solution.lemonadeChange(new int[] {5, 5, 5, 10, 20}));
        assertFalse(solution.lemonadeChange(new int[] {5, 5, 10, 10, 20}));
    }
}
