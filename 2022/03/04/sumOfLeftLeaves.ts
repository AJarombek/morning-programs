/**
 * https://leetcode.com/problems/sum-of-left-leaves/
 * @author Andrew Jarombek
 * @since 3/4/2022
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

function sumOfLeftLeaves(root: TreeNode | null): number {
    let value = 0;

    if (root?.left && !root.left?.left && !root.left?.right) {
        value += root.left.val;
    }

    if (root?.left) {
        value += sumOfLeftLeaves(root.left);
    }

    if (root?.right) {
        value += sumOfLeftLeaves(root.right);
    }

    return value;
}