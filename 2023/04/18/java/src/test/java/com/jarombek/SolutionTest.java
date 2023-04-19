/*
 * Unit tests for a shortest-completing-word program
 * @author Andrew Jarombek
 * @since 4/18/2023
 */

package com.jarombek;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    public void shortestCompletingWord() {
        var solution = new Solution();
        var result = solution.shortestCompletingWord("1s3 PSt", new String[] {"step", "steps", "stripe", "stepple"});
        assertEquals("steps", result);
    }
}
