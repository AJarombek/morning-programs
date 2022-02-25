/**
 * https://leetcode.com/problems/binary-tree-paths/
 * @author Andrew Jarombek
 * @since 2/24/2022
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

function binaryTreePaths(root: TreeNode | null): string[] {
    if (!root) {
        return [];
    }

    if (!root.left && !root.right) {
        return [`${root.val}`];
    }

    return binaryTreePaths(root.left)
        .concat(binaryTreePaths(root.right))
        .map(path => `${root.val}->${path}`);
}