/*
 * Unit tests for the morning program
 * @author Andrew Jarombek
 * @since 6/2/2024
 */

package com.jarombek;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void testStringMatch1() {
        Solution solution = new Solution();
        int[] result = solution.diStringMatch("IDID");
        assertArrayEquals(new int[] {0, 4, 1, 3, 2}, result);
    }

    @Test
    public void testStringMatch2() {
        Solution solution = new Solution();
        int[] result = solution.diStringMatch("III");
        assertArrayEquals(new int[] {0, 1, 2, 3}, result);
    }

    @Test
    public void testStringMatch3() {
        Solution solution = new Solution();
        int[] result = solution.diStringMatch("DDI");
        assertArrayEquals(new int[] {3, 2, 0, 1}, result);
    }
}
