/**
 * https://leetcode.com/problems/univalued-binary-tree/
 * @author Andrew Jarombek
 * @since 10/21/2021
 */

function TreeNode(val, left, right) {
    this.val = (val===undefined ? 0 : val)
    this.left = (left===undefined ? null : left)
    this.right = (right===undefined ? null : right)
}

const isUnivalTree = function(root) {
    const value = root.val;

    const array = [root];
    let index = 0;

    while (index < array.length) {
        const node = array[index];

        if (node.val !== value) {
            return false;
        }

        if (node.left) {
            array.push(node.left);
        }

        if (node.right) {
            array.push(node.right);
        }

        index++;
    }

    return true;
};

const tree = new TreeNode(1, new TreeNode(1), new TreeNode(1));
console.assert(isUnivalTree(tree));

const tree2 = new TreeNode(1, new TreeNode(2), new TreeNode(1));
console.assert(!isUnivalTree(tree2));
