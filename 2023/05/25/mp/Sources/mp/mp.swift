/**
 https://leetcode.com/problems/longest-palindrome/
 - Author: Andrew Jarombek
 - Date: 5/25/2023
 */

public class MorningPrograms {
    func longestPalindrome(_ s: String) -> Int {
        let dict: [Character: Int] = s.reduce(into: [:]) { dict, char in
            dict[char, default: 0] += 1
        }

        var result = 0
        var odd = false

        for (_, value) in dict {
            if value % 2 == 0 {
                result += value
            } else {
                result += value - 1
                odd = true
            }
        }

        if odd {
            result += 1
        }

        return result
    }
}
