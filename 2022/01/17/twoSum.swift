// https://leetcode.com/problems/two-sum/
// Author: Andrew Jarombek
// Date: 1/17/2022

func twoSum(_ nums: [Int], _ target: Int) -> [Int] {
    var dict: [Int:Int] = [:]

    for i in 0..<nums.count {
        let val = target - nums[i]

        if let j = dict[val] {
            return [j, i]
        }

        dict[nums[i]] = i
    }

    return []
}