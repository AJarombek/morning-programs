/**
 * https://leetcode.com/problems/increasing-order-search-tree/
 * @author Andrew Jarombek
 * @since 5/11/2023
 */

const assert = require('assert');

function TreeNode(val, left, right) {
    this.val = (val===undefined ? 0 : val)
    this.left = (left===undefined ? null : left)
    this.right = (right===undefined ? null : right)
}

const increasingBST = function (root) {
    const result = new TreeNode(-1);
    dfs(root, result);
    return result.right;
}

const dfs = function (node, tail) {
    if (node.left) {
        tail = dfs(node.left, tail);
    }

    tail.right = new TreeNode(node.val);
    tail = tail.right;

    if (node.right) {
        tail = dfs(node.right, tail);
    }

    return tail;
}

// Test case 1: Test the conversion of a small binary tree to an increasing order BST
// Create the binary tree
let root = new TreeNode(2);
root.left = new TreeNode(1);
root.right = new TreeNode(3);

// Perform the conversion
let result = increasingBST(root);

// Assert the expected output
assert.strictEqual(result.val, 1);
assert.strictEqual(result.right.val, 2);
assert.strictEqual(result.right.right.val, 3);
assert.strictEqual(result.right.right.right, null);

// Test case 2: Test the conversion of a single-node binary tree
// Create a single-node binary tree
root = new TreeNode(1);

// Perform the conversion
result = increasingBST(root);

// Assert the expected output
assert.strictEqual(result.val, 1);
assert.strictEqual(result.right, null);
