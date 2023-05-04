<?php

/**
 * https://leetcode.com/problems/balanced-binary-tree/
 * @author Andrew Jarombek
 * @since 5/3/2023
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
    function isBalanced(TreeNode|null $root): bool {
        [$_, $balanced] = $this->checkBalanced($root);
        return $balanced;
    }

    private function checkBalanced(TreeNode|null $root): array {
        if ($root == null) {
            return [0, true];
        }

        [$leftDepth, $leftBalanced] = $this->checkBalanced($root->left);
        [$rightDepth, $rightBalanced] = $this->checkBalanced($root->right);

        if (!$leftBalanced || !$rightBalanced || abs($leftDepth - $rightDepth) > 1) {
            return [0, false];
        } else {
            return [1 + max($leftDepth, $rightDepth), true];
        }
    }
}

$solution = new Solution();
$tree1 = new TreeNode(1, new TreeNode(2), new TreeNode(3));
$tree2 = new TreeNode(1, new TreeNode(2, new TreeNode(3), null), null);

assert($solution->isBalanced($tree1));
assert(!$solution->isBalanced($tree2));
