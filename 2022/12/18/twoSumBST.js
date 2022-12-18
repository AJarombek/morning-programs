/**
 * https://leetcode.com/problems/two-sum-iv-input-is-a-bst/
 * @author Andrew Jarombek
 * @since 12/18/2022
 */

function TreeNode(val, left, right) {
    this.val = (val===undefined ? 0 : val)
    this.left = (left===undefined ? null : left)
    this.right = (right===undefined ? null : right)
}

const findTarget = function(root, k) {
    let set = new Set();
    return dfs(root, k, set);
}

const dfs = function(node, k, set) {
    let left = false;
    let right = false;

    if (node.left) {
        left = dfs(node.left, k, set);
    }

    if (set.has(node.val)) {
        return true;
    }

    set.add(k - node.val);

    if (node.right) {
        right = dfs(node.right, k, set);
    }

    return left || right;
}

const tree = new TreeNode(5, new TreeNode(3, new TreeNode(2), new TreeNode(4)), new TreeNode(6, null, new TreeNode(7)));
console.assert(findTarget(tree, 9));
