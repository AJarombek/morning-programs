/**
 * https://leetcode.com/problems/binary-tree-tilt/
 * @author Andrew Jarombek
 * @since 3/29/2022
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

interface Tilt {
    value: number;
    sum: number;
}

function findTilt(root: TreeNode | null): number {
    let result: Tilt = dfs(root);
    return result.sum;
}

function dfs(root: TreeNode | null): Tilt {
    if (root == null) {
        return {value: 0, sum: 0};
    }

    let leftTilt = dfs(root.left);
    let rightTilt = dfs(root.right);

    let diff = Math.abs(leftTilt.value - rightTilt.value);
    return {
        value: leftTilt.value + rightTilt.value + root.val,
        sum: leftTilt.sum + rightTilt.sum + diff
    };
}