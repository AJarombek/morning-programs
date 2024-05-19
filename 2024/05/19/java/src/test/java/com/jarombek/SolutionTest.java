/*
 * Unit tests for the morning program
 * @author Andrew Jarombek
 * @since 5/19/2024
 */

package com.jarombek;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void testLongPressedName() {
        Solution solution = new Solution();
        boolean result = solution.isLongPressedName("alex", "aaleex");
        assertTrue(result);
    }

    @Test
    public void testLongPressedName2() {
        Solution solution = new Solution();
        boolean result = solution.isLongPressedName("saeed", "ssaaedd");
        assertFalse(result);
    }
}
