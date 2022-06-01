/**
 * https://leetcode.com/problems/cousins-in-binary-tree/
 * @author Andrew Jarombek
 * @since 5/31/2022
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

interface Parent {
    level: number;
    val: number;
}

function isCousins(root: TreeNode | null, x: number, y: number): boolean {
    const xParent = dfs(root, x, 0);
    const yParent = dfs(root, y, 0);

    return xParent?.level == yParent?.level && xParent?.val != yParent?.val;
}

function dfs(node: TreeNode | null, val: number, level: number): Parent | null {
    if (node.left && node.left.val == val || node.right && node.right.val == val) {
        return {
            level,
            val: node.val
        };
    }

    let left = node.left ? dfs(node.left, val, level + 1) : null;
    let right = node.right ? dfs(node.right, val, level + 1) : null;

    return left || right;
}