/**
 * https://leetcode.com/problems/find-mode-in-binary-search-tree/
 * @author Andrew Jarombek
 * @since 3/24/2022
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

function findMode(root: TreeNode | null): number[] {
    let freqMap = new Map<number, number>();
    let max = dfs(root, freqMap, 0);

    let result = [];
    for (let [key, val] of freqMap) {
        if (val == max) {
            result.push(key);
        }
    }

    return result;
}

function dfs(root: TreeNode | null, map: Map<number, number>, max: number): number {
    if (!root) {
        return max;
    }

    let leftMax = dfs(root.left, map, max);
    let rightMax = dfs(root.right, map, Math.max(max, leftMax));

    let val = (map.get(root.val) ?? 0) + 1;
    map.set(root.val, val);
    return Math.max(rightMax, val);
}