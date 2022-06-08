/**
 * https://leetcode.com/problems/sum-of-root-to-leaf-binary-numbers/
 * @author Andrew Jarombek
 * @since 6/7/2022
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

function sumRootToLeaf(root: TreeNode | null): number {
    const result = dfs(root, 0, []);
    return result.reduce((acc, val) => acc + val);
}

function dfs(node: TreeNode | null, value: number, results: number[]): number[] {
    value <<= 1;
    value += node.val;

    if (!node.left && !node.right) {
        results.push(value);
        return results;
    }

    if (node.left) {
        results = dfs(node.left, value, results);
    }

    if (node.right) {
        results = dfs(node.right, value, results);
    }

    return results;
}