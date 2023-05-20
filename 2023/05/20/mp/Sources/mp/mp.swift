/**
 https://leetcode.com/problems/first-unique-character-in-a-string/
 - Author: Andrew Jarombek
 - Date: 5/20/2023
 */

public class MorningPrograms {
    func firstUniqChar(_ s: String) -> Int {
        var dict: [Character:Int] = [:]

        for c in s {
            dict[c] = (dict[c] ?? 0) + 1
        }

        for (i, c) in s.enumerated() {
            if dict[c] == 1 {
                return i
            }
        }

        return -1
    }
}
