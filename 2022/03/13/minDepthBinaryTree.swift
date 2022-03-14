// https://leetcode.com/problems/minimum-depth-of-binary-tree/
// Author: Andrew Jarombek
// Date: 3/13/2022

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
    func minDepth(_ root: TreeNode?) -> Int {
        if root == nil {
            return 0
        }

        return dfs(root!, 0)
    }

    func dfs(_ node: TreeNode, _ level: Int) -> Int {
        if node.left == nil && node.right == nil {
            return 1
        }

        var right = Int.max
        var left = Int.max

        if let rightNode = node.right {
            right = dfs(rightNode, level + 1)
        }

        if let leftNode = node.left {
            left = dfs(leftNode, level + 1)
        }

        return 1 + min(right, left)
    }
}