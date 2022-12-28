/**
 * https://leetcode.com/problems/maximum-depth-of-n-ary-tree/
 * @author Andrew Jarombek
 * @since 12/28/2022
 */

function Node(val,children) {
   this.val = val;
   this.children = children;
}

const maxDepth = function(root) {
    if (!root)
        return 0;

    let val = 0;

    for (let child of root.children) {
        val = Math.max(val, maxDepth(child));
    }

    return 1 + val;
};

const tree = new Node(1, [new Node(2, [])]);
console.assert(maxDepth(tree) === 2);
