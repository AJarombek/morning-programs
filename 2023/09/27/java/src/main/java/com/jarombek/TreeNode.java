/*
 * TreeNode class for the increasing-order-search-tree program
 * @author Andrew Jarombek
 * @since 9/27/2023
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
