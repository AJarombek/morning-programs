/*
 * Unit tests for find-smallest-letter-greater-than-target program
 * @author Andrew Jarombek
 * @since 4/16/2023
 */

package com.jarombek;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    public void nextGreatestLetter() {
        var solution = new Solution();
        var result = solution.nextGreatestLetter(new char[] {'c', 'f', 'j'}, 'a');
        assertEquals('c', result);

        result = solution.nextGreatestLetter(new char[] {'c', 'f', 'j'}, 'c');
        assertEquals('f', result);

        result = solution.nextGreatestLetter(new char[] {'x', 'x', 'y', 'y'}, 'z');
        assertEquals('x', result);
    }
}
