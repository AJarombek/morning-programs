/**
 https://leetcode.com/problems/valid-palindrome/
 - Author: Andrew Jarombek
 - Date: 7/23/2022
 */

class Solution {
    func isPalindrome(_ s: String) -> Bool {
        var start = 0
        var end = s.count - 1
        var valid = true

        while start < end && valid {
            var first = s[start]
            var last = s[end]

            while !first.isLetter && !first.isNumber && start < end {
                start += 1
                first = s[start]
            }

            while !last.isLetter && !last.isNumber && end > start {
                end -= 1
                last = s[end]
            }

            if start < end {
                if first.lowercased() != last.lowercased() {
                    valid = false
                }

                start += 1
                end -= 1
            }
        }

        return valid
    }
}

extension StringProtocol {
    subscript(offset: Int) -> Character {
        self[index(startIndex, offsetBy: offset)]
    }
}

let solution = Solution()
let result = solution.isPalindrome("race a car")
print(result)