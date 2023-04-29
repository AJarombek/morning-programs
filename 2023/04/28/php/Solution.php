<?php

/**
 * https://leetcode.com/problems/binary-tree-inorder-traversal/
 * @author Andrew Jarombek
 * @since 4/28/2023
 */

class TreeNode {
    public TreeNode|null $val = null;
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
    function inorderTraversal(TreeNode|null $root): array {
        $result = [];

        if ($root != null) {
            $this->dfs($root, $result);
        }

        return $result;
    }

    function dfs(TreeNode $root, array &$result): void {
        if ($root->left != null) {
            $this->dfs($root->left, $result);
        }

        $result[] = $root->val;

        if ($root->right != null) {
            $this->dfs($root->right, $result);
        }
    }
}

$solution = new Solution();
$tree = new TreeNode(1, null, new TreeNode(3, new TreeNode(2), null));

$result = $solution->inorderTraversal($tree);
assert($result == [1, 2, 3]);
