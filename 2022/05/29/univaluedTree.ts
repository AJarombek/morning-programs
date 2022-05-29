/**
 * https://leetcode.com/problems/univalued-binary-tree/
 * @author Andrew Jarombek
 * @since 5/29/2022
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

function isUnivalTree(root: TreeNode | null): boolean {
    return dfs(root, root.val);
}

function dfs(root: TreeNode | null, prev: number): boolean {
    const val = root.val;

    const left = root.left ? dfs(root.left, val) : true;
    const right = root.right ? dfs(root.right, val) : true;

    return root.val == prev && left && right;
}