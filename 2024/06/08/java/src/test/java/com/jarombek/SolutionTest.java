/*
 * Unit tests for the morning program
 * @author Andrew Jarombek
 * @since 6/8/2024
 */

package com.jarombek;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void testMinDeletionSize1() {
        Solution solution = new Solution();
        int result = solution.minDeletionSize(new String[] {"cba", "daf", "ghi"});
        assertEquals(1, result);
    }

    @Test
    public void testMinDeletionSize2() {
        Solution solution = new Solution();
        int result = solution.minDeletionSize(new String[] {"a", "b"});
        assertEquals(0, result);
    }
}
