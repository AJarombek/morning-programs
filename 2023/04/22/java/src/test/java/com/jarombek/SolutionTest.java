/*
 * Unit tests for a toeplitz-matrix program
 * @author Andrew Jarombek
 * @since 4/22/2023
 */

package com.jarombek;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    public void numJewelsInStones() {
        var solution = new Solution();
        var result = solution.numJewelsInStones("aA", "aAAbbbb");
        assertEquals(3, result);

        result = solution.numJewelsInStones("z", "ZZ");
        assertEquals(0, result);
    }
}
