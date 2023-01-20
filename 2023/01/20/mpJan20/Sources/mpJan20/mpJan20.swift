/**
 https://leetcode.com/problems/power-of-four/
 https://leetcode.com/problems/reverse-string/
 - Author: Andrew Jarombek
 - Date: 1/20/2023
 */

public class MpJan20 {
    func isPowerOfFour(_ n: Int) -> Bool {
        if n <= 0 {
            return false
        }

        var num = n

        while num > 1 {
            if num % 4 != 0 {
                return false
            }

            num /= 4
        }

        return true
    }

    func reverseString(_ s: inout [Character]) {
        for i in 0..<s.count/2 {
            (s[i], s[s.count-i-1]) = (s[s.count-i-1], s[i])
        }
    }
}
