/**
 https://leetcode.com/problems/assign-cookies/
 - Author: Andrew Jarombek
 - Date: 5/31/2023
 */

public class MorningPrograms {
    func findContentChildren(_ g: [Int], _ s: [Int]) -> Int {
        let sortedG = g.sorted()
        let sortedS = s.sorted()

        var i = 0
        var j = 0

        while i < sortedG.count && j < sortedS.count {
            if sortedG[i] <= sortedS[j] {
                i += 1
            }

            j += 1
        }

        return i
    }
}
