/**
 * https://leetcode.com/problems/diameter-of-binary-tree/
 * @author Andrew Jarombek
 * @since 3/27/2022
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

let result = 0;

function diameterOfBinaryTree(root: TreeNode | null): number {
    result = 0;
    dfs(root);
    return result;
}

function dfs(node: TreeNode | null): number {
    if (node == null) {
        return 0;
    }

    let left = dfs(node.left);
    let right = dfs(node.right);

    result = Math.max(result, left + right);
    return 1 + Math.max(left, right);
}