/*
 * Unit tests for min-cost-climbing-stairs & largest-number-at-least-twice-of-others programs
 * @author Andrew Jarombek
 * @since 4/17/2023
 */

package com.jarombek;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    public void minCostClimbingStairs() {
        var solution = new Solution();
        var result = solution.minCostClimbingStairs(new int[] {10, 15, 20});
        assertEquals(15, result);

        result = solution.minCostClimbingStairs(new int[] {10, 15, 20, 25, 30});
        assertEquals(40, result);
    }

    @Test
    public void dominantIndex() {
        var solution = new Solution();
        var result = solution.dominantIndex(new int[] {3, 6, 1, 0});
        assertEquals(1, result);

        result = solution.dominantIndex(new int[] {1, 2, 3, 4});
        assertEquals(-1, result);
    }
}
