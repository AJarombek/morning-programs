// https://leetcode.com/problems/maximum-depth-of-binary-tree/
// Author: Andrew Jarombek
// Date: 3/10/2022

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

func maxDepth(_ root: TreeNode?) -> Int {
    if (root == nil) {
        return 0
    }

    return 1 + max(maxDepth(root?.left), maxDepth(root?.right))
}