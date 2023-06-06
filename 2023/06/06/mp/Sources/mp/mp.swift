/**
 https://leetcode.com/problems/max-consecutive-ones/
 - Author: Andrew Jarombek
 - Date: 6/6/2023
 */

public class MorningPrograms {
    func findMaxConsecutiveOnes(_ nums: [Int]) -> Int {
        var result = 0
        var current = 0

        for num in nums {
            if num == 0 {
                result = max(result, current)
                current = 0
            } else {
                current += 1
            }
        }

        return max(result, current)
    }
}
