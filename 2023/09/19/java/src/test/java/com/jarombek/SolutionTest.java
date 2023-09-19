/*
 * Unit tests for a binary-gap program
 * @author Andrew Jarombek
 * @since 9/19/2023
 */

package com.jarombek;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

public class SolutionTest {

    // Helper function to create a binary tree
    private TreeNode createTree(Integer... values) {
        TreeNode[] nodes = new TreeNode[values.length];
        for (int i = 0; i < values.length; i++) {
            if (values[i] != null) {
                nodes[i] = new TreeNode(values[i]);
            }
        }
        for (int i = 0; i < values.length / 2; i++) {
            int leftIndex = 2 * i + 1;
            int rightIndex = 2 * i + 2;
            if (nodes[i] != null) {
                if (leftIndex < values.length) {
                    nodes[i].left = nodes[leftIndex];
                }
                if (rightIndex < values.length) {
                    nodes[i].right = nodes[rightIndex];
                }
            }
        }
        return nodes[0];
    }

    @Test
    public void testLeafSimilarTrees() {
        Solution solution = new Solution();

        // Create two similar trees
        TreeNode root1 = createTree(3, 5, 1, 6, 2, 9, 8, null, null, 7, 4);
        TreeNode root2 = createTree(3, 5, 1, 6, 2, 9, 8, null, null, 7, 4);

        boolean result = solution.leafSimilar(root1, root2);
        assertTrue(result, "Trees should have similar leaf nodes");
    }

    @Test
    public void testDifferentLeafNodes() {
        Solution solution = new Solution();

        // Create two different trees
        TreeNode root1 = createTree(1, 2, 3);
        TreeNode root2 = createTree(4, 5, 6);

        boolean result = solution.leafSimilar(root1, root2);
        assertFalse(result, "Trees should not have similar leaf nodes");
    }
}

