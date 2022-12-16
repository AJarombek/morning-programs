/**
 * https://leetcode.com/problems/merge-two-binary-trees/
 * @author Andrew Jarombek
 * @since 12/15/2022
 */

function TreeNode(val, left, right) {
    this.val = (val===undefined ? 0 : val)
    this.left = (left===undefined ? null : left)
    this.right = (right===undefined ? null : right)
}

const mergeTrees = function(root1, root2) {
    if (!root1 && !root2) {
        return null;
    }

    const node = new TreeNode((root1?.val ?? 0) + (root2?.val ?? 0));

    if (root1?.left || root2?.left) {
        node.left = mergeTrees(root1?.left, root2?.left);
    }

    if (root1?.right || root2?.right) {
        node.right = mergeTrees(root1?.right, root2?.right);
    }

    return node;
};

const tree1 = new TreeNode(1);
const tree2 = new TreeNode(1, null, new TreeNode(2));
const result = mergeTrees(tree1, tree2);

console.assert(result.val === 2);
console.assert(!result.left);
console.assert(result.right.val === 2);
console.assert(!result.right.right);
console.assert(!result.right.left);