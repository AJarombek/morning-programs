/**
 * https://leetcode.com/problems/detect-capital/
 * @author Andrew Jarombek
 * @since 9/9/2022
 */

function TreeNode(val, left, right) {
    this.val = (val===undefined ? 0 : val)
    this.left = (left===undefined ? null : left)
    this.right = (right===undefined ? null : right)
}

const getMinimumDifference = function(root) {
    const result = dfs(root, {prev: null, min: null});
    return result.min;
};

const dfs = function(root, args) {
    if (root.left) {
        args = dfs(root.left, args);
    }

    let {prev, min} = args;

    if (prev !== null) {
        if (min === null) {
            min = root.val - prev;
        } else {
            min = Math.min(min, root.val - prev);
        }
    }

    prev = root.val;
    args = {prev, min};

    if (root.right) {
        args = dfs(root.right, args);
    }

    return args;
}

let result = getMinimumDifference(new TreeNode(1, null, new TreeNode(6, new TreeNode(4), null)));
console.assert(result === 2);
