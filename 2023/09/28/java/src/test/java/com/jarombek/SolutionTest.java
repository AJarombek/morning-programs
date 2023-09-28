/*
 * Unit tests for a sort-array-by-parity program
 * @author Andrew Jarombek
 * @since 9/28/2023
 */

package com.jarombek;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {

    @Test
    public void testSortArrayByParity1() {
        Solution solution = new Solution();
        int[] input = {3, 1, 2, 4};
        int[] expected = {4, 2, 1, 3};
        int[] result = solution.sortArrayByParity(input);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testSortArrayByParity2() {
        Solution solution = new Solution();
        int[] input = {1, 2, 3, 4, 5, 6};
        int[] expected = {6, 2, 4, 3, 5, 1};
        int[] result = solution.sortArrayByParity(input);
        assertArrayEquals(expected, result);
    }
}

