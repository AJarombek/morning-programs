/**
 https://leetcode.com/problems/hamming-distance/
 - Author: Andrew Jarombek
 - Date: 6/2/2023
 */

public class MorningPrograms {
    func hammingDistance(_ x: Int, _ y: Int) -> Int {
        var x = x
        var y = y
        var result = 0

        while x > 0 || y > 0 {
            if x % 2 != y % 2 {
                result += 1
            }

            x >>= 1
            y >>= 1
        }

        return result
    }
}
