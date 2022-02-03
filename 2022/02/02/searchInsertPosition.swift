// https://leetcode.com/problems/search-insert-position/
// Author: Andrew Jarombek
// Date: 2/2/2022

func searchInsert(_ nums: [Int], _ target: Int) -> Int {
    for (index, num) in nums.enumerated() {
        if target <= num {
            return index
        }
    }

    return nums.count
}