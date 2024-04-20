/*
 * Unit tests for a x-of-a-kind-in-a-deck-of-cards program
 * @author Andrew Jarombek
 * @since 9/30/2023
 */

package com.jarombek;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void testReverseOnlyLetters() {
        Solution solution = new Solution();
        String result = solution.reverseOnlyLetters("ab-cd");
        assertEquals("dc-ba", result);
    }

    @Test
    public void testReverseOnlyLetters2() {
        Solution solution = new Solution();
        String result = solution.reverseOnlyLetters("a-bC-dEf-ghIj");
        assertEquals("j-Ih-gfE-dCba", result);
    }
}
