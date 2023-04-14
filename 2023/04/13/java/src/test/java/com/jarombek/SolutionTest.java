/*
 * Unit tests for 1-bit-and-2-bit-characters program
 * @author Andrew Jarombek
 * @since 4/13/2023
 */

package com.jarombek;

import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    public void selfDividingNumbers() {
        var solution = new Solution();
        List<Integer> result = solution.selfDividingNumbers(47, 85);
        assertEquals(48, result.get(0));
        assertEquals(55, result.get(1));
        assertEquals(66, result.get(2));
        assertEquals(77, result.get(3));
    }
}
