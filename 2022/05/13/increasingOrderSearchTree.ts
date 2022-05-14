/**
 * https://leetcode.com/problems/increasing-order-search-tree/
 * @author Andrew Jarombek
 * @since 5/13/2022
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

let resultRoot = null;

function increasingBST(root: TreeNode | null): TreeNode | null {
    resultRoot = null;
    dfs(root, null);
    return resultRoot;
}

function dfs(root: TreeNode | null, result: TreeNode | null): TreeNode | null {
    if (root.left != null) {
        result = dfs(root.left, result);
    }

    if (result == null) {
        resultRoot = new TreeNode(root.val);
        result = resultRoot;
    } else {
        result.right = new TreeNode(root.val);
        result = result.right;
    }

    if (root.right != null) {
        result = dfs(root.right, result);
    }

    return result;
}