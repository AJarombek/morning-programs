/**
 https://leetcode.com/problems/repeated-substring-pattern/
 - Author: Andrew Jarombek
 - Date: 6/1/2023
 */

import Foundation

public class MorningPrograms {
    func repeatedSubstringPattern(_ s: String) -> Bool {
        let length = s.count

        if length == 1 {
            return false
        }

        for i in 1...length / 2 {
            if length % i == 0 {
                let substring = s.prefix(i)
                let times = length / i
                let repeatedSubstring = Array(repeating: substring, count: times).joined()

                if repeatedSubstring == s {
                    return true
                }
            }
        }

        return false
    }
}
