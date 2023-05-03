<?php

/**
 * https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
 * @author Andrew Jarombek
 * @since 5/2/2023
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
    function sortedArrayToBST(array $nums): TreeNode {
        return $this->dfs($nums);
    }

    function dfs(array &$nums): TreeNode {
        $mid = intdiv(sizeof($nums), 2);

        $tree = new TreeNode($nums[$mid]);

        if ($mid > 0) {
            $left_nums = array_slice($nums, 0, $mid);
            $tree->left = $this->dfs($left_nums);
        }

        if ($mid < sizeof($nums) - 1) {
            $right_nums = array_slice($nums, $mid + 1);
            $tree->right = $this->dfs($right_nums);
        }

        return $tree;
    }
}

$solution = new Solution();
$tree = $solution->sortedArrayToBST([1, 2, 3]);

assert($tree->val == 2);
assert($tree->left->val == 1);
assert($tree->right->val == 3);
