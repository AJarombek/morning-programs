/**
 https://leetcode.com/problems/find-the-difference/
 - Author: Andrew Jarombek
 - Date: 5/21/2023
 */

public class MorningPrograms {
    func findTheDifference(_ s: String, _ t: String) -> Character {
        var map: [Character:Int] = [:]

        for c in s {
            map[c] = (map[c] ?? 0) + 1
        }

        for c in t {
            map[c] = (map[c] ?? 0) - 1
        }

        for (key, value) in map {
            if value < 0 {
                return key
            }
        }

        return " "
    }
}
