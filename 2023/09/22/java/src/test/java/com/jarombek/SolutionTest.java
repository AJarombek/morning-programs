/*
 * Unit tests for a uncommon-words-from-two-sentences program
 * @author Andrew Jarombek
 * @since 9/22/2023
 */

package com.jarombek;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertArrayEquals;

public class SolutionTest {

    @Test
    public void testUncommonFromSentencesExample1() {
        Solution solution = new Solution();
        String s1 = "this is the first sentence";
        String s2 = "this is the second sentence";
        String[] expected = {"first", "second"};
        String[] result = solution.uncommonFromSentences(s1, s2);
        assertArrayEquals(expected, result);
    }

    @Test
    public void testUncommonFromSentencesExample2() {
        Solution solution = new Solution();
        String s1 = "apple apple";
        String s2 = "banana";
        String[] expected = {"banana"};
        String[] result = solution.uncommonFromSentences(s1, s2);
        assertArrayEquals(expected, result);
    }
}


