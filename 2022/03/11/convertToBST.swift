// https://leetcode.com/problems/convert-sorted-array-to-binary-search-tree/
// Author: Andrew Jarombek
// Date: 3/11/2022

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
    func sortedArrayToBST(_ nums: [Int]) -> TreeNode? {
        if nums.count == 0 {
            return nil
        }

        var root = TreeNode()
        buildTree(nums, 0, nums.count - 1, &root)
        return root
    }

    func buildTree(_ nums: [Int], _ start: Int, _ end: Int, _ result: inout TreeNode) {
        if start <= end {
            let mid = (start + end) / 2
            result.val = nums[mid]

            if start <= mid - 1 {
                result.left = TreeNode()
                buildTree(nums, start, mid - 1, &result.left!)
            }

            if end >= mid + 1 {
                result.right = TreeNode()
                buildTree(nums, mid + 1, end, &result.right!)
            }
        }
    }
}