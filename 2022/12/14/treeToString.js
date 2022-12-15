/**
 * https://leetcode.com/problems/construct-string-from-binary-tree/
 * @author Andrew Jarombek
 * @since 12/14/2022
 */

function TreeNode(val, left, right) {
    this.val = (val===undefined ? 0 : val)
    this.left = (left===undefined ? null : left)
    this.right = (right===undefined ? null : right)
}

const tree2str = function(root) {
    if (!root) {
        return "";
    }

    const sections = [
        root.val,
        root.left ? `(${tree2str(root.left)})` : '',
        !root.left && root.right ? '()' : '',
        root.right ? `(${tree2str(root.right)})` : ''
    ];

    return sections.join("");
};

let tree = new TreeNode(1, new TreeNode(2, new TreeNode(4)), new TreeNode(3));
console.assert(tree2str(tree) === "1(2(4))(3)");

tree = new TreeNode(1, new TreeNode(2, null, new TreeNode(4)), new TreeNode(3));
console.assert(tree2str(tree) === "1(2()(4))(3)");
