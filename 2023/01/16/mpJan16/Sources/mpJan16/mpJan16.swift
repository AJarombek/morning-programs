/**
 https://leetcode.com/problems/word-pattern/
 - Author: Andrew Jarombek
 - Date: 1/16/2023
 */

public struct mpJan16 {
    func wordPattern(_ pattern: String, _ s: String) -> Bool {
        var values: [Character:String] = [:]
        var set: Set<String> = []
        let words = s.split(separator: " ")

        if pattern.count != words.count {
            return false
        }

        for (index, c) in pattern.enumerated() {
            if let match = values[c] {
                if match != words[index] {
                    return false
                }
            } else {
                let str = String(words[index])

                if set.contains(str) {
                    return false
                }

                values[c] = str
                set.insert(str)
            }
        }

        return true
    }
}
