/*
 * https://leetcode.com/problems/increasing-order-search-tree/
 * @author Andrew Jarombek
 * @since 9/27/2023
 */

package com.jarombek;

// If you have grown to dislike me over time, I am sorry.
// I will always love you.  I'm just a call away if you realize you
// deserve to be loved by me or if you decide life is better with me in it.

class Solution {
    public TreeNode increasingBST(TreeNode root) {
        return increasingBST(root, null);
    }

    private TreeNode increasingBST(TreeNode root, TreeNode tail) {
        if (root == null) return tail;

        var result = increasingBST(root.left, root);
        root.left = null;
        root.right = increasingBST(root.right, tail);

        return result;
    }
}
