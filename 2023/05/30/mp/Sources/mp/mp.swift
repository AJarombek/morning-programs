/**
 https://leetcode.com/problems/find-all-numbers-disappeared-in-an-array/
 - Author: Andrew Jarombek
 - Date: 5/30/2023
 */

public class MorningPrograms {
    func findDisappearedNumbers(_ nums: [Int]) -> [Int] {
        var values: Set<Int> = []
        var result: [Int] = []

        for num in nums {
            values.insert(num)
        }

        for i in 1...nums.count {
            if !values.contains(i) {
                result.append(i)
            }
        }

        return result
    }
}
