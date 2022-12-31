/**
 * https://leetcode.com/problems/search-in-a-binary-search-tree/
 * @author Andrew Jarombek
 * @since 12/31/2022
 */

function TreeNode(val, left, right) {
    this.val = (val===undefined ? 0 : val)
    this.left = (left===undefined ? null : left)
    this.right = (right===undefined ? null : right)
}

const searchBST = function(root, val) {
    if (root === null || root.val === val) {
        return root;
    }

    if (root.val > val) {
        return searchBST(root.left, val);
    } else {
        return searchBST(root.right, val);
    }
}

const tree = new TreeNode(4, new TreeNode(2, new TreeNode(1), new TreeNode(3)), new TreeNode(7));
console.assert(searchBST(tree, 2) !== null);
console.assert(searchBST(tree, 5) === null);
