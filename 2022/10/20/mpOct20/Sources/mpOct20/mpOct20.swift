/**
 https://leetcode.com/problems/invert-binary-tree/
 https://leetcode.com/problems/summary-ranges/
 - Author: Andrew Jarombek
 - Date: 10/20/2022
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

public struct mpOct20 {
    func invertTree(_ root: TreeNode?) -> TreeNode? {
        if root == nil {
            return nil
        }

        let left = root?.left
        root?.left = invertTree(root?.right)
        root?.right = invertTree(left)

        return root
    }

    func summaryRanges(_ nums: [Int]) -> [String] {
        var start: Int? = nil
        var end: Int? = nil
        var result: [String] = []

        for num in nums {
            guard start != nil && end != nil else {
                start = num
                end = start
                continue
            }

            if num == (end ?? 0) + 1 {
                end = num
            } else {
                if start == end {
                    result.append("\(start ?? 0)")
                } else {
                    result.append("\(start ?? 0)->\(end ?? 0)")
                }

                start = num
                end = num
            }
        }

        if start != nil {
            if start == end {
                result.append("\(start ?? 0)")
            } else {
                result.append("\(start ?? 0)->\(end ?? 0)")
            }
        }

        return result
    }
}
