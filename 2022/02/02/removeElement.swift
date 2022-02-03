// https://leetcode.com/problems/remove-element/
// Author: Andrew Jarombek
// Date: 2/2/2022

func removeElement(_ nums: inout [Int], _ val: Int) -> Int {
    var k = nums.count - 1
    var i = 0

    while i <= k {
        if nums[i] == val {
            nums[i] = nums[k]
            k -= 1
        } else {
            i += 1
        }
    }

    return k + 1
}