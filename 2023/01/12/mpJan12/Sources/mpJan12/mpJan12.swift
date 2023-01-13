/**
 https://leetcode.com/problems/valid-anagram/
 - Author: Andrew Jarombek
 - Date: 1/12/2023
 */

public class TreeNode {
    public var val: Int
    public var left: TreeNode?
    public var right: TreeNode?
    public init() { val = 0; left = nil; right = nil; }
    public init(_ val: Int) { self.val = val; left = nil; right = nil; }
    public init(_ val: Int, _ left: TreeNode?, _ right: TreeNode?) {
        self.val = val
        self.left = left
        self.right = right
    }
}

public struct mpJan12 {
    func binaryTreePaths(_ root: TreeNode?) -> [String] {
        if root == nil {
            return []
        }

        var result: [String] = []
        dfs(root, path: "", result: &result)
        return result
    }

    func dfs(_ node: TreeNode?, path: String, result: inout [String]) {
        if (node?.left == nil && node?.right == nil) {
            result.append("\(path)\(node!.val)")
            return
        }

        let newPath = "\(path)\(node!.val)->"

        if (node?.left != nil) {
            dfs(node?.left, path: newPath, result: &result)
        }

        if (node?.right != nil) {
            dfs(node?.right, path: newPath, result: &result)
        }
    }
}
