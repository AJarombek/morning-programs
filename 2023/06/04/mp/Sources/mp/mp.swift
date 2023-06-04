/**
 https://leetcode.com/problems/number-complement/
 - Author: Andrew Jarombek
 - Date: 6/4/2023
 */

public class MorningPrograms {
    func findComplement(_ num: Int) -> Int {
        var result = 0
        var power = 0
        var num = num

        while num > 0 {
            let bit = num & 1
            let complement = bit == 0 ? 1 : 0

            result += complement << power

            power += 1
            num >>= 1
        }

        return result
    }
}
