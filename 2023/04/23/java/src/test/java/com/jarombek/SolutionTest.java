/*
 * Unit tests for a minimum-distance-between-bst-nodes program
 * @author Andrew Jarombek
 * @since 4/23/2023
 */

package com.jarombek;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {
    @Test
    public void minDiffInBST() {
        var solution = new Solution();

        var tree = new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(6));

        var result = solution.minDiffInBST(tree);
        assertEquals(1, result);
    }
}
