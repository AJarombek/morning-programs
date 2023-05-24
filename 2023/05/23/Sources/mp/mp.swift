/**
 https://leetcode.com/problems/sum-of-left-leaves/
 - Author: Andrew Jarombek
 - Date: 5/23/2023
 */

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

public class MorningPrograms {
    func sumOfLeftLeaves(_ root: TreeNode?) -> Int {
        if root == nil {
            return 0
        }

        return sumOfLeaves(root!, isLeft: false)
    }

    private func sumOfLeaves(_ root: TreeNode, isLeft: Bool) -> Int {
        if root.left == nil && root.right == nil {
            if isLeft {
                return root.val
            }

            return 0
        }

        var sum = 0

        if let left = root.left {
            sum += sumOfLeaves(left, isLeft: true)
        }

        if let right = root.right {
            sum += sumOfLeaves(right, isLeft: false)
        }

        return sum
    }
}
