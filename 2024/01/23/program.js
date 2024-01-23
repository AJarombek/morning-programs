/**
 * https://leetcode.com/problems/range-sum-of-bst/
 * @author Andrew Jarombek
 * @since 1/23/2024
 */

function TreeNode(val, left, right) {
    this.val = (val===undefined ? 0 : val)
    this.left = (left===undefined ? null : left)
    this.right = (right===undefined ? null : right)
}

const rangeSumBST = function(root, low, high) {
    if (!root) {
        return 0;
    }

    let result = 0;

    if (root.val >= low && root.val <= high) {
        result += root.val;
    }

    if (root.val > low) {
        result += rangeSumBST(root.left, low, high);
    }

    if (root.val < high) {
        result += rangeSumBST(root.right, low, high);
    }

    return result;
};
