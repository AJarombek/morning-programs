/**
 * https://leetcode.com/problems/two-sum-iv-input-is-a-bst/
 * @author Andrew Jarombek
 * @since 4/6/2022
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

function findTarget(root: TreeNode | null, k: number): boolean {
    let index = 0;
    let queue = [root];
    let results = new Set<number>();

    while (index < queue.length) {
        let node = queue[index];

        if (results.has(node.val)) {
            return true;
        }

        results.add(k - node.val);

        if (node.left) {
            queue.push(node.left);
        }

        if (node.right) {
            queue.push(node.right);
        }

        index++;
    }

    return false;
}