/*
 * Unit tests for a increasing-order-search-tree program
 * @author Andrew Jarombek
 * @since 9/27/2023
 */

package com.jarombek;

import static org.junit.jupiter.api.Assertions.*;

import org.junit.jupiter.api.Test;

public class SolutionTest {

    private boolean areTreesEqual(TreeNode tree1, TreeNode tree2) {
        if (tree1 == null && tree2 == null) {
            return true;
        }
        if (tree1 == null || tree2 == null) {
            return false;
        }
        if (tree1.val != tree2.val) {
            return false;
        }
        return areTreesEqual(tree1.left, tree2.left) && areTreesEqual(tree1.right, tree2.right);
    }

    @Test
    public void testIncreasingBSTSingleNode() {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(5);

        TreeNode result = solution.increasingBST(root);

        assertTrue(areTreesEqual(root, result));
    }

    @Test
    public void testIncreasingBSTMultipleNodes() {
        Solution solution = new Solution();
        TreeNode root = new TreeNode(5);
        root.left = new TreeNode(3);
        root.right = new TreeNode(6);
        root.left.left = new TreeNode(2);
        root.left.right = new TreeNode(4);
        root.right.right = new TreeNode(8);
        root.left.left.left = new TreeNode(1);
        root.right.right.left = new TreeNode(7);
        root.right.right.right = new TreeNode(9);

        TreeNode expected = new TreeNode(1);
        expected.right = new TreeNode(2);
        expected.right.right = new TreeNode(3);
        expected.right.right.right = new TreeNode(4);
        expected.right.right.right.right = new TreeNode(5);
        expected.right.right.right.right.right = new TreeNode(6);
        expected.right.right.right.right.right.right = new TreeNode(7);
        expected.right.right.right.right.right.right.right = new TreeNode(8);
        expected.right.right.right.right.right.right.right.right = new TreeNode(9);

        TreeNode result = solution.increasingBST(root);

        assertTrue(areTreesEqual(expected, result));
    }
}
