/*
 * Unit tests for a x-of-a-kind-in-a-deck-of-cards program
 * @author Andrew Jarombek
 * @since 9/30/2023
 */

package com.jarombek;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void testHasGroupsSizeXValidInput() {
        Solution solution = new Solution();
        int[] deck = {1, 1, 2, 2, 2, 2};
        boolean result = solution.hasGroupsSizeX(deck);
        assertTrue(result);
    }

    @Test
    public void testHasGroupsSizeXInvalidInput() {
        Solution solution = new Solution();
        int[] deck = {1, 1, 1, 2, 2, 3};
        boolean result = solution.hasGroupsSizeX(deck);
        assertFalse(result);
    }
}
