/**
 * https://leetcode.com/problems/subtree-of-another-tree/
 * @author Andrew Jarombek
 * @since 3/30/2022
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

function isSubtree(root: TreeNode | null, subRoot: TreeNode | null): boolean {
    if (root?.val == subRoot?.val) {
        let result = dfs(root, subRoot);

        if (result)
            return true;
    }

    let left = false;
    let right = false;

    if (root?.left != null) {
        left = isSubtree(root.left, subRoot);
    }

    if (root?.right != null) {
        right = isSubtree(root.right, subRoot);
    }

    return left || right;
}

function dfs(node1: TreeNode | null, node2: TreeNode | null): boolean {
    if (node1 == null && node2 == null) {
        return true;
    }

    if (node1 == null || node2 == null) {
        return false;
    }

    if (node1.val != node2.val) {
        return false;
    }

    let left = dfs(node1.left, node2.left);
    let right = dfs(node1.right, node2.right);
    return left && right;
}