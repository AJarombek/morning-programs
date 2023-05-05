<?php

/**
 * https://leetcode.com/problems/minimum-depth-of-binary-tree/
 * @author Andrew Jarombek
 * @since 5/4/2023
 */

class TreeNode {
    public int|null $val = null;
    public TreeNode|null $left = null;
    public TreeNode|null $right = null;
    function __construct($val = 0, $left = null, $right = null) {
        $this->val = $val;
        $this->left = $left;
        $this->right = $right;
    }
}

class Solution
{
    function minDepth(TreeNode|null $root): int {
        if ($root == null)
            return 0;

        return $this->dfs($root);
    }

    function dfs(TreeNode $root): int {
        if ($root->right == null && $root->left == null) {
            return 1;
        }

        $min = PHP_INT_MAX;

        if ($root->left != null) {
            $min = $this->dfs($root->left);
        }

        if ($root->right != null) {
            $min = min($min, $this->dfs($root->right));
        }

        return 1 + $min;
    }
}

$solution = new Solution();
$tree1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
$tree2 = new TreeNode(1, new TreeNode(2, new TreeNode(3), null), null);

assert($solution->minDepth($tree1) == 2);
assert($solution->minDepth($tree2) == 3);
