/**
 * https://leetcode.com/problems/find-mode-in-binary-search-tree/
 * @author Andrew Jarombek
 * @since 9/7/2022
 */

function TreeNode(val, left, right) {
    this.val = (val===undefined ? 0 : val)
    this.left = (left===undefined ? null : left)
    this.right = (right===undefined ? null : right)
}

const findMode = function(root) {
    const result = dfs(root, {mode: 0, count: 0, prev: 0, values: []});
    return result.values;
};

const dfs = function(node, args) {
    if (node.left) {
        args = dfs(node.left, args);
    }

    let {mode, count, prev, values} = args;

    if (node.val === prev) {
        count++;
    } else {
        prev = node.val;
        count = 1;
    }

    if (count > mode) {
        values = [prev];
        mode = count;
    } else if (count === mode) {
        values.push(prev);
    }

    args = {mode, count, prev, values};

    if (node.right) {
        args = dfs(node.right, args);
    }

    return args;
}

let result = findMode(new TreeNode(1, null, new TreeNode(2)));
let expected = [1, 2]
console.assert(expected.every((value, index) => value === result[index]));

result = findMode(new TreeNode(1, null, new TreeNode(2, new TreeNode(2), null)));
expected = [2]
console.assert(expected.every((value, index) => value === result[index]));
