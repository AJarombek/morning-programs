/**
 * https://leetcode.com/problems/leaf-similar-trees/
 * @author Andrew Jarombek
 * @since 5/9/2022
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

function leafSimilar(root1: TreeNode | null, root2: TreeNode | null): boolean {
    let leaves1 = dfs(root1, []);
    let leaves2 = dfs(root2, []);
    return leaves1.join(",") == leaves2.join(",");
}

function dfs(root: TreeNode | null, leaves: string[]): string[] {
    if (!root.left && !root.right) {
        leaves.push(`${root.val}`);
        return leaves;
    }

    if (root.left) {
        dfs(root.left, leaves);
    }

    if (root.right) {
        dfs(root.right, leaves);
    }

    return leaves;
}