/**
 https://leetcode.com/problems/binary-tree-postorder-traversal/
 - Author: Andrew Jarombek
 - Date: 10/12/2022
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
    func postorderTraversal(_ root: TreeNode?) -> [Int] {
        if root == nil {
            return []
        }

        var result: [Int] = []

        dfs(root, &result)
        return result
    }

    func dfs(_ root: TreeNode?, _ values: inout [Int]) {
        if root?.left != nil {
            dfs(root?.left, &values)
        }

        if root?.right != nil {
            dfs(root?.right, &values)
        }

        values.append(root!.val)
    }

    func postorderTraversalV1(_ root: TreeNode?) -> [Int] {
        if root == nil {
            return []
        }

        return dfsV1(root, [])
    }

    func dfsV1(_ root: TreeNode?, _ values: [Int]) -> [Int] {
        var result = values

        if root?.left != nil {
            result = dfsV1(root?.left, result)
        }

        if root?.right != nil {
            result = dfsV1(root?.right, result)
        }

        result.append(root!.val)
        return result
    }
}