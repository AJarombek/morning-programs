/*
 * Unit tests for the morning program
 * @author Andrew Jarombek
 * @since 6/15/2024
 */

package com.jarombek;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void testRepeatedNTimes1() {
        Solution solution = new Solution();
        int result = solution.repeatedNTimes(new int[] {1, 2, 3, 3});
        assertEquals(3, result);
    }

    @Test
    public void testRepeatedNTimes2() {
        Solution solution = new Solution();
        int result = solution.repeatedNTimes(new int[] {2, 1, 2, 5, 3, 2});
        assertEquals(2, result);
    }

    @Test
    public void testRepeatedNTimes3() {
        Solution solution = new Solution();
        int result = solution.repeatedNTimes(new int[] {5, 1, 5, 2, 5, 3, 5, 4});
        assertEquals(5, result);
    }
}
