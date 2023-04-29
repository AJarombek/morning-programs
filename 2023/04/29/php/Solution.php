<?php

/**
 * https://leetcode.com/problems/same-tree/
 * @author Andrew Jarombek
 * @since 4/29/2023
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
    function isSameTree(TreeNode|null $p, TreeNode|null $q): bool {
        if ($p == null && $q == null) {
            return true;
        }

        if (($p == null && $q != null) || ($p != null && $q == null)) {
            return false;
        }

        if ($p->val != $q->val) {
            return false;
        }

        $left = $this->isSameTree($q->left, $p->left);
        $right = $this->isSameTree($q->right, $p->right);

        return $left && $right;
    }
}

$solution = new Solution();
$tree1 = new TreeNode(1, null, new TreeNode(3, new TreeNode(2), null));
$tree2 = new TreeNode(1, null, new TreeNode(3, new TreeNode(2), null));
$tree3 = new TreeNode(1, null, new TreeNode(2, new TreeNode(3), null));

assert($solution->isSameTree($tree1, $tree2));
assert(!$solution->isSameTree($tree1, $tree3));
