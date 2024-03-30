/**
 * https://leetcode.com/problems/add-to-array-form-of-integer/
 * @author Andrew Jarombek
 * @since 3/30/2024
 */

function TreeNode(val, left, right) {
    this.val = (val===undefined ? 0 : val)
    this.left = (left===undefined ? null : left)
    this.right = (right===undefined ? null : right)
}

/**
 * @param {TreeNode} root
 * @param {number} x
 * @param {number} y
 * @return {boolean}
 */
const areCousins = function(root, x, y) {
    const [parentX, depthX] = dfs(root, 0, 0, x);
    const [parentY, depthY] = dfs(root, 0, 0, y);

    return parentX !== parentY && depthX === depthY;
};

/**
 * @param {TreeNode} node
 * @param {number} parent
 * @param {number} depth
 * @param {number} x
 * @return {(number|*)[]}
 */
const dfs = function (node, parent, depth, x) {
    if (node.val === x) {
        return [parent, depth];
    }

    let result = null;

    if (node.left) {
        result = dfs(node.left, node.val, depth+1, x);
    }

    if (result === null && node.right) {
        result = dfs(node.right, node.val, depth+1, x);
    }

    return result;
}
