/*
 * https://leetcode.com/problems/minimum-distance-between-bst-nodes/
 * @author Andrew Jarombek
 * @since 4/23/2023
 */

package com.jarombek;

import java.util.HashSet;
import java.util.Set;

public class Solution {
    private Integer prev = null;
    private Integer diff = null;

    public int minDiffInBST(TreeNode root) {
        this.prev = null;
        this.diff = null;

        dfs(root);

        return this.diff;
    }

    public void dfs(TreeNode root) {
        if (root.left != null) {
            dfs(root.left);
        }

        if (this.prev != null && (this.diff == null || root.val - this.prev < this.diff)) {
            this.diff = root.val - this.prev;
        }

        this.prev = root.val;

        if (root.right != null) {
            dfs(root.right);
        }
    }
}
