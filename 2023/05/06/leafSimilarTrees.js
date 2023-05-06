/**
 * https://leetcode.com/problems/binary-gap/
 * @author Andrew Jarombek
 * @since 5/6/2023
 */

const assert = require('assert');

function TreeNode(val, left, right) {
    this.val = (val===undefined ? 0 : val)
    this.left = (left===undefined ? null : left)
    this.right = (right===undefined ? null : right)
}

const leafSimilar = function(root1, root2) {
    const result1 = dfs(root1, []);
    const result2 = dfs(root2, []);

    return result1.join("-") === result2.join("-");
};

const dfs = function(node, arr) {
    if (!node.left && !node.right) {
        arr.push(node.val);
    }

    if (node.left) {
        dfs(node.left, arr);
    }

    if (node.right) {
        dfs(node.right, arr);
    }

    return arr;
}

// Test case 1: Leaf nodes are similar
const root1 = new TreeNode(1,
  new TreeNode(2,
    new TreeNode(4),
    new TreeNode(5)
  ),
  new TreeNode(3,
    new TreeNode(6),
    new TreeNode(7)
  )
);

const root2 = new TreeNode(1,
  new TreeNode(2,
    new TreeNode(4),
    new TreeNode(5)
  ),
  new TreeNode(3,
    new TreeNode(6),
    new TreeNode(7)
  )
);

assert.strictEqual(leafSimilar(root1, root2), true, 'Test case 1 failed');

// Test case 2: Leaf nodes are different
const root3 = new TreeNode(1,
  new TreeNode(2,
    new TreeNode(4),
    new TreeNode(5)
  ),
  new TreeNode(3,
    new TreeNode(6),
    new TreeNode(7)
  )
);

const root4 = new TreeNode(1,
  new TreeNode(2,
    new TreeNode(4),
    new TreeNode(5)
  ),
  new TreeNode(3,
    new TreeNode(6),
    new TreeNode(8)
  )
);

assert.strictEqual(leafSimilar(root3, root4), false, 'Test case 2 failed');
