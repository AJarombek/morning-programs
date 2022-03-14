// https://leetcode.com/problems/path-sum/
// Author: Andrew Jarombek
// Date: 3/13/2022

class Solution {
    func hasPathSum(_ root: TreeNode?, _ targetSum: Int) -> Bool {
        if root == nil {
            return false
        }

        return dfs(root!, targetSum, 0)
    }

    func dfs(_ root: TreeNode, _ targetSum: Int, _ actualSum: Int) -> Bool {
        let newSum = actualSum + root.val

        if root.left == nil && root.right == nil {
            return newSum == targetSum
        }

        var left = false
        var right = false

        if let leftRoot = root.left {
            left = dfs(leftRoot, targetSum, newSum)
        }

        if let rightRoot = root.right {
            right = dfs(rightRoot, targetSum, newSum)
        }

        return left || right
    }
}