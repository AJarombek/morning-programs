/**
 * https://leetcode.com/problems/number-of-1-bits/
 * @author Andrew Jarombek
 * @since 3/26/2022
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

function getMinimumDifference(root: TreeNode | null): number {
    let result = null;
    let previous = null;
    let stack = [root];

    while (stack.length > 0) {
        let node = stack.pop();

        if (node.left != null) {
            let newNode = new TreeNode(node.val, null, node.right);
            stack.push(newNode);
            stack.push(node.left);
        } else {
            if (previous != null) {
                result = result == null ? node.val - previous : Math.min(result, node.val - previous);
            }

            previous = node.val;

            if (node.right != null) {
                stack.push(node.right);
            }
        }
    }

    return result;
}
