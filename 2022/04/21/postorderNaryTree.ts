/**
 * https://leetcode.com/problems/n-ary-tree-postorder-traversal/
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

function postorder(root: TreeNode | null): number[] {
    if (!root) {
        return [];
    }

    let result = [];

    for (let child of root.children) {
        let childResult = postorder(child);

        for (let val of childResult) {
            result.push(val);
        }
    }

    result.push(root.val);
    return result;
}