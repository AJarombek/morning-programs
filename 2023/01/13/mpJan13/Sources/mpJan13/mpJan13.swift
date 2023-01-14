/**
 https://leetcode.com/problems/add-digits/
 - Author: Andrew Jarombek
 - Date: 1/13/2023
 */

public struct mpJan13 {
    func addDigits(_ num: Int) -> Int {
        var result = num

        while result > 9 {
            var next = 0

            while result > 0 {
                next += result % 10
                result /= 10
            }

            result = next
        }

        return result
    }
}
