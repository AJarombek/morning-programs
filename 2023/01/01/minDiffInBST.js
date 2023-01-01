/**
 * https://leetcode.com/problems/minimum-distance-between-bst-nodes/
 * @author Andrew Jarombek
 * @since 1/1/2023
 */

function TreeNode(val, left, right) {
    this.val = (val===undefined ? 0 : val)
    this.left = (left===undefined ? null : left)
    this.right = (right===undefined ? null : right)
}

let prev = -Infinity;
let result = Infinity;

const minDiffInBST = function(root) {
    prev = -Infinity;
    result = Infinity;

    dfs(root);
    return result;
};

const dfs = function(node) {
    if (node.left) {
        dfs(node.left);
    }

    console.info(node.val);
    result = Math.min(node.val - prev, result);
    prev = node.val;

    if (node.right) {
        dfs(node.right);
    }
}

const tree = new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(6));
console.assert(minDiffInBST(tree) === 1);
