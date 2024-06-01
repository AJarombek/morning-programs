/*
 * Unit tests for the morning program
 * @author Andrew Jarombek
 * @since 5/31/2024
 */

package com.jarombek;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    @Test
    public void testRangeSumBST1() {
        Solution solution = new Solution();
        int result = solution.rangeSumBST(new TreeNode(10), 7, 15);
        assertEquals(10, result);
    }

    @Test
    public void testRangeSumBST2() {
        Solution solution = new Solution();
        int result = solution.rangeSumBST(new TreeNode(10, new TreeNode(5), new TreeNode(15)), 7, 15);
        assertEquals(25, result);
    }
}
