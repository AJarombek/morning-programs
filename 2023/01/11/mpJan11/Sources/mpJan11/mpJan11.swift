/**
 https://leetcode.com/problems/valid-anagram/
 - Author: Andrew Jarombek
 - Date: 1/11/2023
 */

public struct mpJan11 {
    func isAnagram(_ s: String, _ t: String) -> Bool {
        if s.count != t.count {
            return false
        }

        var dict: [Character:Int] = [:]

        for c in s {
            dict[c] = (dict[c] ?? 0) + 1
        }

        for c in t {
            dict[c] = (dict[c] ?? 0) - 1
        }

        for (_, value) in dict {
            if value != 0 {
                return false
            }
        }

        return true
    }
}
