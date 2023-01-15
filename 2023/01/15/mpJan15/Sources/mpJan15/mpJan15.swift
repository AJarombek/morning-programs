/**
 https://leetcode.com/problems/move-zeroes/
 - Author: Andrew Jarombek
 - Date: 1/15/2023
 */

public struct mpJan15 {
    func moveZeroes(_ nums: inout [Int]) {
        var index = 0

        for num in nums {
            if num != 0 {
                nums[index] = num
                index += 1
            }
        }

        while index < nums.count {
            nums[index] = 0
            index += 1
        }
    }
}
