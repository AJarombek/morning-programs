/**
 https://leetcode.com/problems/power-of-two/
 - Author: Andrew Jarombek
 - Date: 10/21/2022
 */

public struct mpOct21 {
    func isPowerOfTwo(_ n: Int) -> Bool {
        if n <= 0 {
            return false
        }

        if n == 1 {
            return true
        }

        var num = n

        while num > 1 {
            if num & 1 == 1 {
                return false
            }

            num >>= 1
        }

        return true
    }
}
