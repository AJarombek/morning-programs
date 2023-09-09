/*
 * Unit tests for a most-common-word program
 * @author Andrew Jarombek
 * @since 9/9/2023
 */

package com.jarombek;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    public void mostCommonWord() {
        var solution = new Solution();

        assertEquals("andy", solution.mostCommonWord("andy, my name is andy", new String[]{"my"}));
        assertEquals("is", solution.mostCommonWord("andy, my name is andy", new String[]{"my", "name", "andy"}));
    }
}
