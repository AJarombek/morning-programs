/*
 * Unit tests for a smallest-range-i program
 * @author Andrew Jarombek
 * @since 9/29/2023
 */

package com.jarombek;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

public class SolutionTest {

    @Test
    public void testSmallestRange1() {
        Solution solution = new Solution();
        int[] nums = {1, 3, 6};
        int k = 3;
        int expected = 0;
        int result = solution.smallestRangeI(nums, k);
        assertEquals(expected, result);
    }

    @Test
    public void testSmallestRange2() {
        Solution solution = new Solution();
        int[] nums = {0, 10};
        int k = 2;
        int expected = 6;
        int result = solution.smallestRangeI(nums, k);
        assertEquals(expected, result);
    }
}

