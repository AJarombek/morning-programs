/**
 * https://leetcode.com/problems/maximum-depth-of-n-ary-tree/
 * @author Andrew Jarombek
 * @since 4/21/2022
 */

class TreeNode {
    val: number
    children: TreeNode[]
    constructor(val?: number, children?: TreeNode[]) {
        this.val = (val===undefined ? 0 : val)
        this.children = (children===undefined ? [] : children)
    }
}

function maxDepth(root: TreeNode | null): number {
    if (!root) {
        return 0;
    }

    let maxChildDepth = 0;

    for (let child of root.children) {
        maxChildDepth = Math.max(maxChildDepth, maxDepth(child));
    }

    return 1 + maxChildDepth;
}