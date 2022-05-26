/**
 * https://leetcode.com/problems/range-sum-of-bst/
 * @author Andrew Jarombek
 * @since 5/25/2022
 */

class TreeNode {
    val: number
    left: TreeNode | null
    right: TreeNode | null
    constructor(val?: number, left?: TreeNode | null, right?: TreeNode | null) {
        this.val = (val===undefined ? 0 : val)
        this.left = (left===undefined ? null : left)
        this.right = (right===undefined ? null : right)
    }
}

function rangeSumBST(root: TreeNode | null, low: number, high: number): number {
    return dfs(root, low, high, 0);
}

function dfs(root: TreeNode | null, low: number, high: number, total: number): number {
    if (!root) {
        return total;
    }

    total = dfs(root.left, low, high, total);

    if (root.val >= low && root.val <= high) {
        total += root.val;
    }

    total = dfs(root.right, low, high, total);

    return total;
}