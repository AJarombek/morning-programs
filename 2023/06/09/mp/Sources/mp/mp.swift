/**
 https://leetcode.com/problems/keyboard-row/
 - Author: Andrew Jarombek
 - Date: 6/9/2023
 */

import Foundation

public class MorningPrograms {
    func findWords(_ words: [String]) -> [String] {
        let row1 = Set(Array("qwertyuiop"))
        let row2 = Set(Array("asdfghjkl"))
        let row3 = Set(Array("zxcvbnm"))

        var result = [String]()

        for word in words {
            let lowercased = word.lowercased()
            let set = Set(Array(lowercased))

            if row1.intersection(set).count == set.count ||
                row2.intersection(set).count == set.count ||
                row3.intersection(set).count == set.count {
                result.append(word)
            }
        }

        return result
    }
}
