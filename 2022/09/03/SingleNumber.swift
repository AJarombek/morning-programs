/**
 https://leetcode.com/problems/single-number/
 - Author: Andrew Jarombek
 - Date: 9/3/2022
 */

class Solution {
    func singleNumber(_ nums: [Int]) -> Int {
        var items: Set<Int> = []

        for num in nums {
            if items.contains(num) {
                items.remove(num)
            } else {
                items.insert(num)
            }
        }

        for item in items {
            return item
        }

        return 0
    }
}

let solution = Solution()
let result = solution.singleNumber([2, 2, 1])
print(result)