/*
 * Unit tests for the morning program
 * @author Andrew Jarombek
 * @since 6/1/2024
 */

package com.jarombek;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void testValidMountainArray1() {
        Solution solution = new Solution();
        boolean result = solution.validMountainArray(new int[] {2,1});
        assertFalse(result);
    }

    @Test
    public void testValidMountainArray2() {
        Solution solution = new Solution();
        boolean result = solution.validMountainArray(new int[] {3,5,5});
        assertFalse(result);
    }

    @Test
    public void testValidMountainArray3() {
        Solution solution = new Solution();
        boolean result = solution.validMountainArray(new int[] {0,3,2,1});
        assertTrue(result);
    }
}
