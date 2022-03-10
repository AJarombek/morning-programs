// https://leetcode.com/problems/binary-tree-inorder-traversal/
// Author: Andrew Jarombek
// Date: 3/9/2022

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

func inorderTraversal(_ root: TreeNode?) -> [Int] {
    var result: [Int] = []
    dfs(root, &result)
    return result
}

func dfs(_ root: TreeNode?, _ result: inout [Int]) -> Void {
    if let node = root {
        dfs(node.left, &result)
        result.append(node.val)
        dfs(node.right, &result)
    }
}