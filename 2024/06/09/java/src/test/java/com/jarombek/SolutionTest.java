/*
 * Unit tests for the morning program
 * @author Andrew Jarombek
 * @since 6/9/2024
 */

package com.jarombek;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void testIsAlienSorted1() {
        Solution solution = new Solution();
        boolean result = solution.isAlienSorted(new String[] {"hello", "leetcode"}, "hlabcdefgijkmnopqrstuvwxyz");
        assertTrue(result);
    }

    @Test
    public void testIsAlienSorted2() {
        Solution solution = new Solution();
        boolean result = solution.isAlienSorted(new String[] {"word", "world", "row"}, "worldabcefghijkmnpqstuvxyz");
        assertFalse(result);
    }
}
