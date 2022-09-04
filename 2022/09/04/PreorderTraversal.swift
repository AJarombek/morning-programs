/**
 https://leetcode.com/problems/binary-tree-preorder-traversal/
 - Author: Andrew Jarombek
 - Date: 9/4/2022
 */

import Foundation

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
    func preorderTraversal(_ root: TreeNode?) -> [Int] {
        if root == nil {
            return []
        }

        var result = [root!.val]

        var left: [Int] = []
        var right: [Int] = []

        if root?.left != nil {
            left = preorderTraversal(root?.left)
        }

        if root?.right != nil {
            right = preorderTraversal(root?.right)
        }

        return result + left + right
    }
}

let solution = Solution()
var result = solution.preorderTraversal(nil)
print(result)

let node = TreeNode(2, TreeNode(1), TreeNode(3))
result = solution.preorderTraversal(node)
print(result)
