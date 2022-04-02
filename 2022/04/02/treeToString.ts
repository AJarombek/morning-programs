/**
 * https://leetcode.com/problems/construct-string-from-binary-tree/
 * @author Andrew Jarombek
 * @since 4/2/2022
 */

class TreeNode {
    val: number
    left: TreeNode | null
    right: TreeNode | null
    constructor(val?: number, left?: TreeNode | null, right?: TreeNode | null) {
        this.val = (val===undefined ? 0 : val)
        this.left = (left===undefined ? null : left)
        this.right = (right===undefined ? null : right)
    }
}

function tree2str(root: TreeNode | null): string {
    if (!root) {
        return "()";
    }

    let left = tree2str(root.left);
    let right = tree2str(root.right);

    if (left == "()" && right == "()") {
        return `${root.val}`;
    } else if (right == "()") {
        return `${root.val}(${left})`;
    } else if (left == "()") {
        return `${root.val}${left}(${right})`;
    } else {
        return `${root.val}(${left})(${right})`;
    }
}
