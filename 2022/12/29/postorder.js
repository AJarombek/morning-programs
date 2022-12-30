/**
 * https://leetcode.com/problems/n-ary-tree-postorder-traversal/
 * @author Andrew Jarombek
 * @since 12/29/2022
 */

function Node(val, children) {
   this.val = val;
   this.children = children;
}

const postorder = function(root) {
    const result = [];

    if (!root) {
        return result;
    }

    return dfs(root, result);
}

const dfs = function(node, list) {
    for (let child of node.children) {
        list = dfs(child, list);
    }

    list.push(node.val);
    return list;
}

const tree = new Node(1, [new Node(3, [new Node(5, []), new Node(6, [])]), new Node(2, []), new Node(4, [])]);
const expected = [5,6,3,2,4,1];
const result = postorder(tree);

console.assert(
    expected.every((value, index) => value === result[index])
);
