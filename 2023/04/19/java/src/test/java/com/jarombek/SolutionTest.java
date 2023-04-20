/*
 * Unit tests for a prime-number-of-set-bits-in-binary-representation program
 * @author Andrew Jarombek
 * @since 4/19/2023
 */

package com.jarombek;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    public void countPrimeSetBits() {
        var solution = new Solution();
        var result = solution.countPrimeSetBits(6, 10);
        assertEquals(4, result);

        result = solution.countPrimeSetBits(10, 15);
        assertEquals(5, result);
    }
}
