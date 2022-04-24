/**
 * https://leetcode.com/problems/minimum-distance-between-bst-nodes/
 * @author Andrew Jarombek
 * @since 4/24/2022
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

let previous: number | null = null;

function minDiffInBST(root: TreeNode | null): number {
    let result: number | null = null;

    if (root.left) {
        result = minDiffInBST(root.left)
    }

    if (previous != null) {
        let distance = Math.abs(previous - root.val);
        console.info(distance)

        if (result == null) {
            result = distance;
        } else {
            result = Math.min(result, distance);
        }
    }

    previous = root.val;

    if (root.right) {
        result = Math.min(result, minDiffInBST(root.right));
    }

    return result;
}
