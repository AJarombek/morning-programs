/*
 * TreeNode class for a binary tree.
 * @author Andrew Jarombek
 * @since 9/19/2023
 */

package com.jarombek;

public class TreeNode {
    int val;
    TreeNode left;
    TreeNode right;
    TreeNode() {}
    TreeNode(int val) { this.val = val; }
    TreeNode(int val, TreeNode left, TreeNode right) {
        this.val = val;
        this.left = left;
        this.right = right;
    }
}
