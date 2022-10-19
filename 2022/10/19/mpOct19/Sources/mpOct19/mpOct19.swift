/**
 https://leetcode.com/problems/contains-duplicate-ii/
 - Author: Andrew Jarombek
 - Date: 10/19/2022
 */

public struct mpOct19 {
    func containsNearbyDuplicate(_ nums: [Int], _ k: Int) -> Bool {
        var map: [Int:Int] = [:]

        for i in 0..<nums.count {
            let j = i - k - 1

            if j >= 0 {
                let num = nums[j]
                map[num] = (map[num] ?? 0) - 1
            }

            let n = nums[i]
            let val = map[n] ?? 0

            if val > 0 {
                return true
            }

            map[n] = val + 1
        }

        return false
    }
}
