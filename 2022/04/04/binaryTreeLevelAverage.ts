/**
 * https://leetcode.com/problems/average-of-levels-in-binary-tree/
 * @author Andrew Jarombek
 * @since 4/4/2022
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

function averageOfLevels(root: TreeNode | null): number[] {
    let result: number[] = [];
    let set = new Set<TreeNode>();
    set.add(root);

    while (set.size != 0) {
        let newSet = new Set<TreeNode>();
        let sum = 0;
        let count = set.size;

        for (let entry of set.entries()) {
            let node = entry[0];
            sum += node.val;

            if (node.left)
                newSet.add(node.left);

            if (node.right)
                newSet.add(node.right);
        }

        result.push(sum / count);
        set = newSet;
    }

    return result;
}