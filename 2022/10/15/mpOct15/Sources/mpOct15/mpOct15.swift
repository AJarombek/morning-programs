/**
 https://leetcode.com/problems/majority-element/
 https://leetcode.com/problems/excel-sheet-column-number/
 - Author: Andrew Jarombek
 - Date: 10/15/2022
 */

public struct mpOct15 {
    func majorityElement(_ nums: [Int]) -> Int {
        var dict: [Int:Int] = [:]

        for num in nums {
            let val = (dict[num] ?? 0) + 1

            if val > nums.count / 2 {
                return num
            }

            dict[num] = val
        }

        return -1
    }

    func titleToNumber(_ columnTitle: String) -> Int {
        let a = Int(Character("A").asciiValue!)
        var result = 0

        for char in columnTitle {
            result *= 26
            result += Int(char.asciiValue!) - a + 1
        }

        return result
    }
}
