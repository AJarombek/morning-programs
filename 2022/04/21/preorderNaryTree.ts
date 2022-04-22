/**
 * https://leetcode.com/problems/n-ary-tree-preorder-traversal/
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

function preorder(root: TreeNode | null): number[] {
    if (!root) {
        return [];
    }

    let result = [root.val];

    for (let child of root.children) {
        let childResult = preorder(child);

        for (let val of childResult) {
            result.push(val);
        }
    }

    return result;
}