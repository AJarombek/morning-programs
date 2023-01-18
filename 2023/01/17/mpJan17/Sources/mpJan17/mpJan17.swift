/**
 https://leetcode.com/problems/range-sum-query-immutable/
 - Author: Andrew Jarombek
 - Date: 1/17/2023
 */

public class NumArray {
    var nums: [Int]

    public init(_ nums: [Int]) {
        self.nums = nums
    }

    public func sumRange(_ left: Int, _ right: Int) -> Int {
        nums[left...right].reduce(0, +)
    }
}
