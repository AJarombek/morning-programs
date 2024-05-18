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
    public void testSortArray() {
        Solution solution = new Solution();
        int[] result = solution.sortArrayByParityII(new int[] {4,2,5,7});
        assertArrayEquals(new int[] {4,5,2,7}, result);
    }

    @Test
    public void testSortArray2() {
        Solution solution = new Solution();
        int[] result = solution.sortArrayByParityII(new int[] {2,3});
        assertArrayEquals(new int[] {2,3}, result);
    }
}
