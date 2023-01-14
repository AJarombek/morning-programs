/**
 https://leetcode.com/problems/missing-number/
 - Author: Andrew Jarombek
 - Date: 1/14/2023
 */

public struct mpJan14 {
    func missingNumber(_ nums: [Int]) -> Int {
        var set: Set<Int> = []

        for i in 0...nums.count {
            set.insert(i)
        }

        for num in nums {
            set.remove(num)
        }

        return set.popFirst() ?? -1
    }

    func missingNumberV2(_ nums: [Int]) -> Int {
        let n = nums.count
        return (n * (n+1) / 2) - nums.reduce(0, +)
    }
}
