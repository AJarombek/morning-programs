/**
 * https://leetcode.com/problems/binary-tree-tilt/
 * @author Andrew Jarombek
 * @since 9/12/2022
 */

function TreeNode(val, left, right) {
    this.val = (val===undefined ? 0 : val)
    this.left = (left===undefined ? null : left)
    this.right = (right===undefined ? null : right)
}

let tilt = 0;

const findTilt = function(root) {
    if (!root)
        return 0;

    tilt = 0;
    dfs(root);
    return tilt;
};

const dfs = function(root) {
    let left = 0;
    let right = 0;

    if (root.left)
        left = dfs(root.left)
    if (root.right)
        right = dfs(root.right)

    tilt += Math.abs(left - right);
    return left + right + root.val;
};

const tree = new TreeNode(1, new TreeNode(2), new TreeNode(3));
console.assert(findTilt(tree) === 1);
