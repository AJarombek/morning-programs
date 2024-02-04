/**
 * https://leetcode.com/problems/n-repeated-element-in-size-2n-array/
 * https://leetcode.com/problems/univalued-binary-tree/
 * @author Andrew Jarombek
 * @since 2/4/2024
 */

/**
 * @param {number[]} nums
 * @return {number}
 */
const repeatedNTimes = function(nums) {
    const found = new Set();

    for (let num of nums) {
        if (found.has(num)) {
            return num;
        }

        found.add(num);
    }

    return -1;
};

function TreeNode(val, left, right) {
    this.val = (val===undefined ? 0 : val)
    this.left = (left===undefined ? null : left)
    this.right = (right===undefined ? null : right)
}

/**
 * @param {TreeNode} root
 * @return {boolean}
 */
const isUnivalTree = function(root) {
    const val = root.val;
    return dfs(root.left, val) && dfs(root.right, val);
};

/**
 * @param {TreeNode} root
 * @param {number} val
 * @return {boolean}
 */
const dfs = function(root, val) {
    if (!root)
        return true;

    if (root.val !== val)
        return false;

    return dfs(root.left, val) && dfs(root.right, val);
};
