/**
 https://leetcode.com/problems/ransom-note/
 - Author: Andrew Jarombek
 - Date: 1/24/2023
 */

public class MorningPrograms {
    func canConstruct(_ ransomNote: String, _ magazine: String) -> Bool {
        var chars: [Character:Int] = [:]

        for c in magazine {
            chars[c] = (chars[c] ?? 0) + 1
        }

        for c in ransomNote {
            if let val = chars[c] {
                if val == 0 {
                    return false
                }

                chars[c] = val - 1
            } else {
                return false
            }
        }

        return true
    }
}
