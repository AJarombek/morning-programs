/**
 * https://leetcode.com/problems/evaluate-boolean-binary-tree/
 * @author Andrew Jarombek
 * @since 3/16/2023
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

function evaluateTree(root: TreeNode | null): boolean {
    if (root.left == null) {
        return !!root.val;
    }

    const left = evaluateTree(root.left);
    const right = evaluateTree(root.right);

    if (root.val == 2) {
        return left || right;
    } else {
        return left && right;
    }
}