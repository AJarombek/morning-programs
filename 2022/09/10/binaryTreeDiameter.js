/**
 * https://leetcode.com/problems/diameter-of-binary-tree/
 * @author Andrew Jarombek
 * @since 9/10/2022
 */

function TreeNode(val, left, right) {
    this.val = (val===undefined ? 0 : val)
    this.left = (left===undefined ? null : left)
    this.right = (right===undefined ? null : right)
}

let max = 0;

const diameterOfBinaryTree = function(root) {
    max = 0;
    dfs(root);
    return max;
};

const dfs = function(root) {
    if (!root.left && !root.right)
        return 1;

    let left = root.left ? dfs(root.left) : 0;
    let right = root.right ? dfs(root.right) : 0;

    max = Math.max(max, left + right);
    return Math.max(left, right) + 1;
}

const tree = new TreeNode(1, new TreeNode(2));
console.assert(diameterOfBinaryTree(tree) === 1);