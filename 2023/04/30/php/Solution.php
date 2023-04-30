<?php

/**
 * https://leetcode.com/problems/symmetric-tree/
 * @author Andrew Jarombek
 * @since 4/30/2023
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
    function isSymmetric(TreeNode|null $root): bool {
        if ($root == null)
            return false;

        return $this->checkSymmetric($root->left, $root->right);
    }

    private function checkSymmetric(TreeNode|null $left, TreeNode|null $right): bool {
        if ($left == null && $right == null)
            return true;

        if (($left == null && $right != null) || ($left != null && $right == null) || $left->val != $right->val) {
            return false;
        }

        return $this->checkSymmetric($left->right, $right->left) && $this->checkSymmetric($left->left, $right->right);
    }
}

$solution = new Solution();
$tree1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
$tree2 = new TreeNode(1, new TreeNode(2), new TreeNode(2));

assert(!$solution->isSymmetric($tree1));
assert($solution->isSymmetric($tree2));
