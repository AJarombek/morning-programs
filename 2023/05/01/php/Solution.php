<?php

/**
 * https://leetcode.com/problems/maximum-depth-of-binary-tree/
 * @author Andrew Jarombek
 * @since 5/1/2023
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
    function maxDepth(TreeNode|null $root): int {
        if ($root == null)
            return 0;

        $left = $this->maxDepth($root->left);
        $right = $this->maxDepth($root->right);

        return 1 + max($left, $right);
    }
}

$solution = new Solution();
$tree1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
$tree2 = new TreeNode(1, new TreeNode(2, new TreeNode(3), null), null);

assert($solution->maxDepth($tree1) == 2);
assert($solution->maxDepth($tree2) == 3);
