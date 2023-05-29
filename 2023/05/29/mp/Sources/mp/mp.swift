/**
 https://leetcode.com/problems/number-of-segments-in-a-string/
 https://leetcode.com/problems/arranging-coins/
 - Author: Andrew Jarombek
 - Date: 5/29/2023
 */

public class MorningPrograms {
    func countSegments(_ s: String) -> Int {
        s.split(separator: " ").count
    }

    func arrangeCoins(_ n: Int) -> Int {
        var coins = n
        var rows = 0

        while coins >= 0 {
            rows += 1
            coins -= rows
        }

        return rows - 1
    }
}
