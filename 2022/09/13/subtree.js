/**
 * https://leetcode.com/problems/diameter-of-binary-tree/
 * @author Andrew Jarombek
 * @since 9/13/2022
 */

function TreeNode(val, left, right) {
    this.val = (val===undefined ? 0 : val)
    this.left = (left===undefined ? null : left)
    this.right = (right===undefined ? null : right)
}

const isSubtree = function(root, subRoot) {
    let left = false;
    let right = false;

    if (root.left)
        left = isSubtree(root.left, subRoot);
    if (root.right)
        right = isSubtree(root.right, subRoot);

    if (left || right)
        return true;

    if (root.val === subRoot.val)
        return dfs(root, subRoot);

    return false;
};

const dfs = function(root, subRoot) {
    if (root.val !== subRoot.val)
        return false;

    if (!root.left && subRoot.left || !root.right && subRoot.right ||
        !subRoot.left && root.left || !subRoot.right && root.right)
        return false;

    let left = true;
    let right = true;

    if (root.left)
        left = dfs(root.left, subRoot.left)

    if (root.right)
        right = dfs(root.right, subRoot.right)

    return left && right;
}

const tree = new TreeNode(
    3,
    new TreeNode(4, new TreeNode(1), new TreeNode(2)),
    new TreeNode(5)
);
const subTree = new TreeNode(4, new TreeNode(1), new TreeNode(2))
console.assert(isSubtree(tree, subTree));
