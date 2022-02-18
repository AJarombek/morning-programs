/**
 * https://leetcode.com/problems/invert-binary-tree/
 * @author Andrew Jarombek
 * @since 2/18/2022
 */

class TreeNode {
    val: number;
    left: TreeNode | null;
    right: TreeNode | null;

    constructor(val?: number, left?: TreeNode | null, right?: TreeNode | null) {
        this.val = (val === undefined ? 0 : val);
        this.left = (left === undefined ? null : left);
        this.right = (right === undefined ? null : right);
    }
}

function invertTree(root: TreeNode | null): TreeNode | null {
    if (!root) {
        return root;
    }

    const tempRight = root.right;
    root.right = invertTree(root.left);
    root.left = invertTree(tempRight);
    return root;
}
