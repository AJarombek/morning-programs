/**
 * https://leetcode.com/problems/second-minimum-node-in-a-binary-tree/
 * @author Andrew Jarombek
 * @since 4/8/2022
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

function findSecondMinimumValue(root: TreeNode | null): number {
    return dfs(root, root.val);
}

function dfs(root: TreeNode | null, val: number): number {
    if (!root.left) {
        return root.val == val ? -1 : root.val;
    }

    let left = dfs(root.left, val);
    let right = dfs(root.right, val);

    if (left == -1 || right == -1) {
        return Math.max(left, right);
    } else {
        return Math.min(left, right);
    }
}