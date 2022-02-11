// https://leetcode.com/problems/maximum-subarray/
// Author: Andrew Jarombek
// Date: 2/10/2022

func maxSubArray(_ nums: [Int]) -> Int {
    var largest = nums[0]
    var current = 0

    for i in 0..<nums.count {
        current += nums[i]

        if current > largest {
            largest = current
        }

        if current < 0 {
            current = 0
        }
    }

    return largest
}