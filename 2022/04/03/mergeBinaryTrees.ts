/**
 * https://leetcode.com/problems/merge-two-binary-trees/
 * @author Andrew Jarombek
 * @since 4/3/2022
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

function mergeTrees(root1: TreeNode | null, root2: TreeNode | null): TreeNode | null {
    if (!root1 && !root2) {
        return null;
    }

    let left = mergeTrees(root1?.left, root2?.left);
    let right = mergeTrees(root1?.right, root2?.right);

    let val = (root1?.val ?? 0) + (root2?.val ?? 0);
    return new TreeNode(val, left, right);
}