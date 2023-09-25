/*
 * Unit tests for a fair-candy-swap program
 * @author Andrew Jarombek
 * @since 9/24/2023
 */

package com.jarombek;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {

    @Test
    public void testFairCandySwap() {
        Solution solution = new Solution();

        int[] expected = {1, 2};
        int[] result = solution.fairCandySwap(new int[]{1, 1}, new int[]{2, 2});
        assertArrayEquals(expected, result);

        result = solution.fairCandySwap(new int[]{1, 2}, new int[]{2, 3});
        assertArrayEquals(expected, result);

        expected = new int[]{2, 3};
        result = solution.fairCandySwap(new int[]{2}, new int[]{1, 3});
        assertArrayEquals(expected, result);
    }
}


