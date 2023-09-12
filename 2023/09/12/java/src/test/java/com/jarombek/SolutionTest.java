/*
 * Unit tests for a positions-of-large-groups program
 * @author Andrew Jarombek
 * @since 9/12/2023
 */

package com.jarombek;

import org.junit.jupiter.api.Test;

import java.util.Arrays;
import java.util.List;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    public void largeGroupPositions() {
        var solution = new Solution();

        List<List<Integer>> expected = List.of(Arrays.asList(0, 2));
        List<List<Integer>> result = solution.largeGroupPositions("aaa");
        assertEquals(expected, result);

        expected = List.of();
        result = solution.largeGroupPositions("abc");
        assertEquals(expected, result);
    }
}
