/**
 * https://leetcode.com/problems/average-of-levels-in-binary-tree/
 * @author Andrew Jarombek
 * @since 12/16/2022
 */

function TreeNode(val, left, right) {
    this.val = (val===undefined ? 0 : val)
    this.left = (left===undefined ? null : left)
    this.right = (right===undefined ? null : right)
}

const averageOfLevels = function(root) {
    if (!root) {
        return [];
    }

    const result = [];
    let queue = [root];

    while (queue.length > 0) {
        let newQueue = [];
        let sum = 0;

        for (const node of queue) {
            sum += node.val;

            if (node.left)
                newQueue.push(node.left);

            if (node.right)
                newQueue.push(node.right);
        }

        result.push(sum / queue.length);
        queue = newQueue;
    }

    return result;
}

const tree = new TreeNode(1, new TreeNode(2, new TreeNode(4)), new TreeNode(3));
const result = averageOfLevels(tree);
console.assert(result.length === 3);
console.assert(result[0] === 1);
console.assert(result[1] === 2.5);
console.assert(result[2] === 4);
