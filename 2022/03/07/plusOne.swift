// https://leetcode.com/problems/plus-one/
// Author: Andrew Jarombek
// Date: 3/7/2022

func plusOne(_ digits: [Int]) -> [Int] {
    var remainder = 1
    var result = digits

    for i in (0...result.count - 1).reversed() {
        let val = result[i] + remainder
        result[i] = val % 10
        remainder = val / 10
    }

    if remainder == 1 {
        result.insert(1, at: 0)
    }

    return result
}