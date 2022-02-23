/**
 * https://leetcode.com/problems/lowest-common-ancestor-of-a-binary-search-tree/
 * @author Andrew Jarombek
 * @since 2/21/2022
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

interface lca {
    p?: boolean;
    q?: boolean;
    lowestNode?: TreeNode;
}

function lowestCommonAncestor(root: TreeNode | null, p: TreeNode | null, q: TreeNode | null): TreeNode | null {
	const { lowestNode } = dfs(root, p, q);
    return lowestNode;
}

function dfs(node: TreeNode | null, p: TreeNode | null, q: TreeNode | null): lca {
    if (!node) {
        return {};
    }

    const {p: pLeft, q: qLeft, lowestNode: lowestNodeLeft} = dfs(node.left, p, q);

    if (lowestNodeLeft) {
        return {p: pLeft, q: qLeft, lowestNode: lowestNodeLeft};
    }

    const {p: pRight, q: qRight, lowestNode: lowestNodeRight} = dfs(node.right, p, q);

    if (lowestNodeRight) {
        return {p: pRight, q: qRight, lowestNode: lowestNodeRight};
    }

    if (pLeft && qRight || qLeft && pRight) {
        return {p: true, q: true, lowestNode: node};
    }

    let result: lca = {p: pLeft || pRight, q: qLeft || qRight}

    if (node.val == p.val) {
        result.p = true;
    }

    if (node.val == q.val) {
        result.q = true;
    }

    if (result.p && result.q) {
        result.lowestNode = node;
    }

    return result;
}
