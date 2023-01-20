/**
 https://leetcode.com/problems/counting-bits/
 - Author: Andrew Jarombek
 - Date: 1/19/2023
 */

public class MpJan19 {
    func countBits(_ n: Int) -> [Int] {
        var result: [Int] = []

        for i in 0...n {
            var num = i
            var val = 0

            while num > 0 {
                val += num & 1
                num >>= 1
            }

            result.append(val)
        }

        return result
    }
}
