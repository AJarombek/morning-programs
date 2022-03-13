// https://leetcode.com/problems/balanced-binary-tree/
// Author: Andrew Jarombek
// Date: 3/12/2022

public class TreeNode {
    public var val: Int
    public var left: TreeNode?
    public var right: TreeNode?
    public init() { self.val = 0; self.left = nil; self.right = nil; }
    public init(_ val: Int) { self.val = val; self.left = nil; self.right = nil; }
    public init(_ val: Int, _ left: TreeNode?, _ right: TreeNode?) {
        self.val = val
        self.left = left
        self.right = right
    }
}

class Solution {
    func isBalanced(_ root: TreeNode?) -> Bool {
        if root == nil {
            return true
        }

        let result = dfs(root!)
        return result.1
    }

    func dfs(_ node: TreeNode) -> (Int, Bool) {
        if node.left == nil && node.right == nil {
            return (1, true)
        }

        var left = (0, true)
        var right = (0, true)

        if node.left != nil {
            left = dfs(node.left!)
        }

        if node.right != nil {
            right = dfs(node.right!)
        }

        return (max(left.0, right.0) + 1, left.1 && right.1 && abs(left.0 - right.0) < 2)
    }
}