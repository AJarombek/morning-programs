/**
 https://leetcode.com/problems/power-of-three/
 - Author: Andrew Jarombek
 - Date: 1/18/2023
 */

public class MpJan18 {
    func isPowerOfThree(_ n: Int) -> Bool {
        if n <= 0 {
            return false
        }

        var num = n

        while num > 1 {
            if num % 3 != 0 {
                return false
            }

            num /= 3
        }

        return true
    }
}
